package org.example.dsa.mm_graph;

import java.util.ArrayList;


@SuppressWarnings("unchecked")
public class UndirectedGraphWeighted {
	
	public ArrayList<Node> adj[];
	
	public UndirectedGraphWeighted(int vertices) {
		adj = new ArrayList[vertices];
		for (int i=0; i<vertices; i++) {
			adj[i] = new ArrayList<>();
		}
	}
	
	public void addEdge(int u, int v, int weight) {
		adj[u].add(new Node(v, weight));
		adj[v].add(new Node(u, weight));
	}
	
	public void printGraph() {
		for (int i=0; i<adj.length; i++) {
			System.out.print("["+i+"]--->");
			adj[i].forEach(elem -> System.out.print(elem.val+"->") );
			System.out.println();
		}
	}
	
}
