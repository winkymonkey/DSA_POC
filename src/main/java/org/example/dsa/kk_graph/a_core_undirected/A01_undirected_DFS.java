package org.example.dsa.kk_graph.a_core_undirected;

import java.util.ArrayList;

import org.example.dsa.kk_graph.UndirectedGraph;

/**
 * ***************************************************************************************
 * [Undirected] Print DFS
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
		dfs(0, visited);
	}
	
	
	// prints the DFS sequence
	private static void dfs(int current, boolean visited[]) {
		visited[current] = true;
		System.out.print(current + " ");
		
		for (int adjNode : adj[current]) {
			if (!visited[adjNode]) {				// if the adjacent node is not visited earlier
				dfs(adjNode, visited);
			}
		}
	}
	
}
