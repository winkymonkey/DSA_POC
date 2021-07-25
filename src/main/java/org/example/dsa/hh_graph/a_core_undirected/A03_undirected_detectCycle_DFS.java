package org.example.dsa.hh_graph.a_core_undirected;

import java.util.ArrayList;

import org.example.dsa.hh_graph.UndirectedGraph;

/**
 * ***************************************************************************************
 * [Undirected] Detect cycle using DFS
 * ***************************************************************************************
 * 
 *    1 -- 0 -- 3		This graph has a cycle 1-0-2-1
 *    |  /      |
 *    | /       |
 *    2         4
 * 
 * ***************************************************************************************
 */

public class A03_undirected_detectCycle_DFS {
	
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
		System.out.println(dfs(0, visited, -1));
	}
	
	
	// detect cycle using DFS
	private static boolean dfs(int current, boolean visited[], int parent) {
		visited[current] = true;
		
		for (int adjNode : adj[current]) {
			if (!visited[adjNode]) {				// if the adjacent node is not visited earlier
				if (dfs(adjNode, visited, current))
					return true;
			}
			else if (adjNode != parent) {			// if the adjacent node is already visited but it's not the parent node, then it's a cycle
				return true;
			}
		}
		return false;
	}
	
}
