package org.example.dsa.kk_graph.a_core_undirected;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import org.example.dsa.kk_graph.Pair;
import org.example.dsa.kk_graph.UndirectedGraph;

/**
 * ***************************************************************************************
 * [Undirected] Detect cycle using DFS
 * ***************************************************************************************
 * 
 *    1 -- 0 -- 3			This graph has a cycle 1-0-2-1
 *    |  /      |
 *    | /       |
 *    2         4
 * 
 * ***************************************************************************************
 */

public class A04_undirected_detectCycle_BFS {
	
	private static final int vertices = 5;
	private static ArrayList<Integer> adj[];
	
	
	public static void main(String[] args) {
		UndirectedGraph graph = new UndirectedGraph(vertices);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(2, 1);
		graph.addEdge(0, 3);
		graph.addEdge(3, 4);
		graph.printGraph();
		adj = graph.adj;
		
		boolean visited[] = new boolean[vertices];
		System.out.println(bfs(new Pair(0, -1), visited));
	}
	
	
	// detect cycle using BFS
	private static boolean bfs(Pair pair, boolean visited[]) {
		Queue<Pair> queue = new LinkedBlockingQueue<>();
		queue.add(pair);
		visited[pair.current] = true;

		while (queue.size() != 0) {
			pair = queue.poll();

			for (int adjNode : adj[pair.current]) {
				if (!visited[adjNode]) {					// if the adjacent node is not visited earlier
					visited[adjNode] = true;
					queue.add(new Pair(adjNode, pair.current));
				}
				else if (adjNode != pair.parent) {			// if the adjacent node is already visited but it's not the parent node, then it's a cycle
					return true;
				}
			}
		}
		return false;
	}
	
}
