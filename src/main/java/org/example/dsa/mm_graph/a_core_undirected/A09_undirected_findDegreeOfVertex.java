package org.example.dsa.mm_graph.a_core_undirected;

import org.example.dsa.mm_graph.UndirectedGraphX;

/**
 * ***************************************************************************************
 * [Undirected] Find degree of a node
 * ***************************************************************************************
 * Degree of any vertex is defined as --- the number of edge Incident on it.
 * ***************************************************************************************
 * 
 *    1 -- 0 -- 3
 *    |  /      |
 *    | /       |
 *    2         4
 * 
 * ***************************************************************************************
 */

public class A09_undirected_findDegreeOfVertex {
	
	private static final int vertices = 5;
	private static final int edges = 5;
	
	
	public static void main(String[] args) {
		UndirectedGraphX graph = new UndirectedGraphX(vertices, edges);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(2, 1);
		graph.addEdge(0, 3);
		graph.addEdge(3, 4);
		
		findDegree(graph, 0);
	}
	
	
	private static void findDegree(UndirectedGraphX graph, int vertex) {
		int degree = 0;
		for (int i=0; i<graph.vertices; i++) {
			if (graph.matrix[vertex][i] == 1)
				degree++;
		}
		System.out.println(degree);
	}
	
}
