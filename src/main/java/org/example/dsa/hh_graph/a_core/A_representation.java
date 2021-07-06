package org.example.dsa.hh_graph.a_core;

import java.util.ArrayList;


public class A_representation {
	
	public static void main(String[] args) {
		int vertices = 5;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>(vertices);
		for (int i=0; i<vertices; i++) {
			adj.add(new ArrayList<Integer>());
		}
		
		addEdge(adj, 0, 1);
		addEdge(adj, 0, 4);
		addEdge(adj, 1, 2);
		addEdge(adj, 1, 3);
		addEdge(adj, 1, 4);
		addEdge(adj, 2, 3);
		addEdge(adj, 3, 4);
		
		printGraph(adj);
	}
	
	
	private static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	
	
	private static void printGraph(ArrayList<ArrayList<Integer> > adj) {
		for (int i=0; i<adj.size(); i++) {
			System.out.print(i+"--->");
			adj.get(i).forEach(elem -> System.out.print(elem+"->") );
			System.out.println();
		}
	}
	
}
