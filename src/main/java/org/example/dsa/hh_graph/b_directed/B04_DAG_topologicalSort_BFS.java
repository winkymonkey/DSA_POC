package org.example.dsa.hh_graph.b_directed;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import org.example.dsa.hh_graph.DirectedGraph;

/**
 * ***************************************************************************************
 * [DAG] Topo Sort using BFS
 * ***************************************************************************************
 */

public class B04_DAG_topologicalSort_BFS {
	
	private static final int vertices = 5;
	private static ArrayList<Integer> adj[];
	
	
	public static void main(String[] args) {
		DirectedGraph graph = new DirectedGraph(vertices);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(2, 1);
		graph.addEdge(0, 3);
		graph.addEdge(3, 4);
		graph.printGraph();
		adj = graph.adj;
		
		bfs();
	}
	
	
	// populates the topological sequence using BFS
	private static void bfs() {
		int indegree[] = new int[vertices];
		
		// populate in-degree array
		for (int i=0; i<vertices; i++) {
			for (Integer adjNode : adj[i]) {
				indegree[adjNode]++;
			}
		}
		
		// put all nodes in the queue whose in-degree is 0
		Queue<Integer> queue = new LinkedBlockingQueue<>();
		for (int i=0; i<vertices; i++) {
			if (indegree[i]==0)
				queue.add(i);
		}
		
		while (!queue.isEmpty()) {
			int current = queue.poll();
			System.out.print(current + " ");
			
			for (int adjNode : adj[current]) {
				indegree[adjNode]--;
				if (indegree[adjNode] == 0) {
					queue.add(adjNode);
				}
			}
		}
	}
	
}
