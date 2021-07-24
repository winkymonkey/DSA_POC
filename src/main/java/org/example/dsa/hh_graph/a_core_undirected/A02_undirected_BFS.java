package org.example.dsa.hh_graph.a_core_undirected;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import org.example.dsa.hh_graph.UndirectedGraph;

/**
 * ***************************************************************************************
 * Undirected Graph: Print BFS
 * ***************************************************************************************
 * 
 *    1 -- 0 -- 3
 *    |  /      |
 *    | /       |
 *    2         4
 * 
 * ***************************************************************************************
 */

public class A02_undirected_BFS {
	
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
		bfs(0, visited);
	}
	
	
	// prints the BFS sequence
	private static void bfs(int current, boolean visited[]) {
		Queue<Integer> queue = new LinkedBlockingQueue<>();
		queue.add(current);
		visited[current] = true;

		while (queue.size() != 0) {
			current = queue.poll();
			System.out.print(current + " ");

			for (int adjNode : adj[current]) {
				if (!visited[adjNode]) {				// if the adjacent node is not visited earlier
					visited[adjNode] = true;
					queue.add(adjNode);
				}
			}
		}
	}
	
}
