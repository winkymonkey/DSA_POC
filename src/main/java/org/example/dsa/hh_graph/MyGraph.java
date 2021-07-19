package org.example.dsa.hh_graph;

import java.util.ArrayList;
import java.util.List;


public class MyGraph {
	public List<List<Integer>> adjList;
	
	public MyGraph(int vertices) {
		adjList = new ArrayList<>(vertices);
		for (int i=0; i<vertices; i++) {
			adjList.add(new ArrayList<Integer>());
		}
	}
	
	public void addEdge(int u, int v) {
		adjList.get(u).add(v);
		adjList.get(v).add(u);
	}
	
	public void printGraph() {
		for (int i=0; i<adjList.size(); i++) {
			System.out.print(i+"--->");
			adjList.get(i).forEach(elem -> System.out.print(elem+"->") );
			System.out.println();
		}
	}
	
}
