package org.example.dsa.mm_graph.a_core_undirected;

import java.util.ArrayList;

import org.example.dsa.mm_graph.UndirectedGraph;

/**
 * ***************************************************************************************
 * Undirected Graph: Count number of components
 * ***************************************************************************************
 * 
 *     3 --- 4   1
 *     |         |
 *     |         |
 *     2         0
 * 
 * ***************************************************************************************
 */

public class A99_undirected_numberOfComponents {
	
	private static final int vertices = 5;
	private static ArrayList<Integer> adj[];
	
	
	public static void main(String[] args) {
		UndirectedGraph graph = new UndirectedGraph(vertices);
		graph.addEdge(1, 0);
		graph.addEdge(2, 3);
		graph.addEdge(3, 4);
		graph.printGraph();
		adj = graph.adj;
		
		boolean visited[] = new boolean[vertices];
		for (int i=0; i<vertices; i++) {
			if (!visited[i]) {
				printDFS(i, visited);
				System.out.println();
			}
		}
	}
	
	
	private static void printDFS(int current, boolean visited[]) {
		visited[current] = true;
		System.out.print(current + " ");
		
		for (int adjNode : adj[current]) {
			if (!visited[adjNode]) {				// if the adjacent node is not visited earlier
				printDFS(adjNode, visited);
			}
		}
	}
	
}
