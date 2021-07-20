package org.example.dsa.hh_graph.a_core;

import java.util.ArrayList;

import org.example.dsa.hh_graph.MyGraph;

/**
 * ***************************************************************************************
 * BFS for a Graph
 * ***************************************************************************************
 * https://www.geeksforgeeks.org/depth-first-search-or-dfs-for-a-graph/
 * ***************************************************************************************
 */

public class A02_undirected_DFS {
	
	private static final int vertices = 4;
	private static ArrayList<Integer> adj[];
	
	
	public static void main(String[] args) {
		MyGraph graph = new MyGraph(vertices);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 2);
		graph.addEdge(2, 0);
		graph.addEdge(2, 3);
		graph.addEdge(3, 3);
		graph.printGraph();
		adj = graph.adj;
		
		boolean visited[] = new boolean[vertices];
		printDFS(2, visited);
	}
	
	
	private static void printDFS(int start, boolean visited[]) {
		visited[start] = true;
		System.out.print(start + " ");
		
		for (int num : adj[start]) {
			if (!visited[num])
				printDFS(num, visited);
		}
	}
	
}
