package org.example.dsa.mm_graph.b_directed;

import java.util.ArrayList;

import org.example.dsa.mm_graph.DirectedGraph;

/**
 * ***************************************************************************************
 * [Directed] Detect cycle using DFS
 * ***************************************************************************************
 */

public class B05_directed_detectCycle_DFS {
	
	private static final int vertices = 4;
	private static ArrayList<Integer> adj[];
	
	
	public static void main(String[] args) {
		DirectedGraph graph = new DirectedGraph(vertices);
		graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);
		graph.printGraph();
		adj = graph.adj;
		
		boolean visited[] = new boolean[vertices];
		boolean dfsVisited[] = new boolean[vertices];			// to track if the node is visited in current dfs recursion call
		System.out.println(dfs(0, visited, dfsVisited));
	}
	
	
	// detect cycle using DFS
	private static boolean dfs(int current, boolean visited[], boolean dfsVisited[]) {
		visited[current] = true;
		dfsVisited[current] = true;
		
		for (int adjNode : adj[current]) {
			if (!visited[adjNode]) {							// if the adjacent node is not visited earlier
				if (dfs(adjNode, visited, dfsVisited))
					return true;
			}
			else if (dfsVisited[adjNode]) {
				return true;
			}
		}
		dfsVisited[current] = false;							// at the end of each recursion call, mark the node as unvisited in dfsVisited
		return false;
	}
	
}
