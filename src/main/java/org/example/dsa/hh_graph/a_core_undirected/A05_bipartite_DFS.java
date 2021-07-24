package org.example.dsa.hh_graph.a_core_undirected;

import java.util.ArrayList;
import java.util.Arrays;

import org.example.dsa.hh_graph.UndirectedGraph;

/**
 * ***************************************************************************************
 * Undirected Graph: bipartite graph using DFS (graph coloring)
 * ***************************************************************************************
 * 
 *    1 -- 0 -- 3		This graph has is NOT bipartite
 *    |  /      |
 *    | /       |
 *    2         4
 * 
 * ***************************************************************************************
 */

public class A05_bipartite_DFS {
	
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
		System.out.println(dfs(0, color));
	}
	
	
	// check if bipartite using DFS
	private static boolean dfs(int current, int color[]) {
		if (color[current] == -1)
			color[current] = 1;
		
		for (int adjNode : adj[current]) {
			if (color[adjNode] == -1) {						// if the adjacent node is not visited earlier
				color[adjNode] = 1-color[current];
				if (!dfs(adjNode, color)) {
					return false;
				}
			}
			else if (color[adjNode] == color[current]) {	// if the adjacent node is already colored & it's the same color as current, then it's not bipartite
				return false;
			}
		}
		return true;
	}
	
}
