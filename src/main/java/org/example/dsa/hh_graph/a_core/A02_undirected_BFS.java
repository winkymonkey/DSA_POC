package org.example.dsa.hh_graph.a_core;

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
		printBFS(0, visited);
	}
	
	
	private static void printBFS(int current, boolean visited[]) {
		Queue<Integer> queue = new LinkedBlockingQueue<>();

		visited[current] = true;
		queue.add(current);

		while (queue.size() != 0) {
			int polled = queue.poll();
			System.out.print(polled + " ");

			for (int adjNode : adj[polled]) {
				if (!visited[adjNode]) {				// if the adjacent node is not visited earlier
					visited[adjNode] = true;
					queue.add(adjNode);
				}
			}
		}
	}
	
}
