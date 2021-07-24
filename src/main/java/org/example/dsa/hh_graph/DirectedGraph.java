package org.example.dsa.hh_graph;

import java.util.ArrayList;


@SuppressWarnings("unchecked")
public class DirectedGraph {
	
	public ArrayList<Integer> adj[];
	
	public DirectedGraph(int vertices) {
		adj = new ArrayList[vertices];
		for (int i=0; i<vertices; i++) {
			adj[i] = new ArrayList<>();
		}
	}
	
	public void addEdge(int u, int v) {
		adj[u].add(v);
		//adj[v].add(u);
	}
	
	public void printGraph() {
		for (int i=0; i<adj.length; i++) {
			System.out.print("["+i+"]--->");
			adj[i].forEach(elem -> System.out.print(elem+"->") );
			System.out.println();
		}
	}
	
}
