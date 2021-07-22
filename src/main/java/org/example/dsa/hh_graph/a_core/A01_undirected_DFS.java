package org.example.dsa.hh_graph.a_core;

import java.util.ArrayList;

import org.example.dsa.hh_graph.UndirectedGraph;

/**
 * ***************************************************************************************
 * Undirected Graph: Print DFS
 * ***************************************************************************************
 * 
 *    1 -- 0 -- 3
 *    |  /      |
 *    | /       |
 *    2         4
 * 
 * ***************************************************************************************
 */

public class A01_undirected_DFS {
	
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
		printDFS(0, visited);
	}
	
	
	private static void printDFS(int current, boolean visited[]) {
		visited[current] = true;
		System.out.print(current + " ");
		
		for (int adjNode : adj[current]) {
			if (!visited[adjNode]) {				// if current node is not visited earlier
				printDFS(adjNode, visited);
			}
		}
	}
	
}
