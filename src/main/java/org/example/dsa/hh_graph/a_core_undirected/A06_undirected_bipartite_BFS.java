package org.example.dsa.hh_graph.a_core_undirected;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import org.example.dsa.hh_graph.UndirectedGraph;

/**
 * ***************************************************************************************
 * [Undirected] Bipartite graph using BFS - graph coloring
 * ***************************************************************************************
 * 
 *    1 -- 0 -- 3		This graph has is NOT bipartite
 *    |  /      |
 *    | /       |
 *    2         4
 * 
 * ***************************************************************************************
 */

public class A06_undirected_bipartite_BFS {
	
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
		
		int color[] = new int[vertices];		Arrays.fill(color, -1);
		System.out.println(bfs(0, color));
	}
	
	
	// check if bipartite using BFS
	private static boolean bfs(int current, int color[]) {
		Queue<Integer> queue = new LinkedBlockingQueue<>();
		queue.add(current);
		color[current] = 1;

		while (queue.size() != 0) {
			current = queue.poll();

			for (int adjNode : adj[current]) {
				if (color[adjNode] == -1) {						// if the adjacent node is not colored earlier
					color[adjNode] = 1-color[current];
					queue.add(adjNode);
				}
				else if (color[adjNode] == color[current]) {	// if the adjacent node is already colored & it's the same color as current, then it's not bipartite
					return false;
				}
			}
		}
		return true;
	}
	
}

