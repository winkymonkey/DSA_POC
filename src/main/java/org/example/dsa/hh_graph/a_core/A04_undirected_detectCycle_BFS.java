package org.example.dsa.hh_graph.a_core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import org.example.dsa.hh_graph.UndirectedGraph;

/**
 * ***************************************************************************************
 * Undirected Graph: Detect cycle using DFS
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
		int parent[] = new int[vertices];			Arrays.fill(parent, -1);		// stores parent of each node
		System.out.println(isCyclic(2, visited, parent));
	}
	
	
	private static boolean isCyclic(int current, boolean visited[], int parent[]) {
		Queue<Integer> queue = new LinkedBlockingQueue<>();

		visited[current] = true;
		queue.add(current);

		while (queue.size() != 0) {
			int polled = queue.poll();

			for (int adjNode : adj[polled]) {
				if (!visited[adjNode]) {					// if current node is not visited earlier
					visited[adjNode] = true;
					queue.add(adjNode);
					parent[adjNode] = polled;
				}
				else if (adjNode != parent[polled]) {
					return true;
				}
			}
		}
		return false;
	}
	
}
