package org.example.dsa.hh_graph.a_core;

import java.util.ArrayList;
import java.util.Arrays;

import org.example.dsa.hh_graph.UndirectedGraph;


public class A06_bipartite_DFS {
	
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
		printDFS(0, color);
	}
	
	
	private static boolean printDFS(int current, int color[]) {
		if (color[current] == -1)
			color[current] = 1;
		
		for (int adjNode : adj[current]) {
			if (color[adjNode] == -1) {				// if the adjacent node is not visited earlier
				color[adjNode] = 1-color[current];
				if (!printDFS(adjNode, color)) {
					return false;
				}
			}
			else if (color[adjNode] == color[current]) {
				return false;
			}
		}
		return true;
	}
	
}
