package org.example.dsa.hh_graph.a_core;

import java.util.ArrayList;

import org.example.dsa.hh_graph.MyGraph;

/**
 * ***************************************************************************************
 * Detect cycle in an undirected graph
 * ***************************************************************************************
 * https://www.geeksforgeeks.org/detect-cycle-undirected-graph/
 * ***************************************************************************************
 */

public class A03_undirected_detectCycle {
	
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
		System.out.println(isCyclic(0, visited, -1));
	}
	
	
	private static Boolean isCyclic(int start, boolean visited[], int parent) {
		visited[start] = true;
		
		for (Integer num : adj[start]) {
			if (!visited[num]) {
				if (isCyclic(num, visited, start))
					return true;
			}
			else if (num != parent)
				return true;
		}
		return false;
	}
	
}
