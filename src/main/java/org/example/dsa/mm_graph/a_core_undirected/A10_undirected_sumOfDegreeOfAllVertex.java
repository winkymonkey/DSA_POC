package org.example.dsa.mm_graph.a_core_undirected;

import org.example.dsa.mm_graph.UndirectedGraphX;

/**
 * ***************************************************************************************
 * [Undirected] Find sum of degree of all nodes
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

public class A10_undirected_sumOfDegreeOfAllVertex {
	
	private static final int vertices = 4;
	private static final int edges = 5;
	
	
	public static void main(String[] args) {
		UndirectedGraphX graph = new UndirectedGraphX(vertices, edges);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(2, 1);
		graph.addEdge(0, 3);
		graph.addEdge(3, 4);
		
		findDegree(graph);
	}
	
	
	private static void findDegree(UndirectedGraphX graph) {
		int sumOfDegree = 0;
		for (int i=0; i<graph.vertices; i++) {
			for (int j=0; j<graph.vertices; j++) {
				if (graph.matrix[i][j] == 1)
					sumOfDegree++;
			}
		}
		System.out.println(sumOfDegree);
	}
	
}
