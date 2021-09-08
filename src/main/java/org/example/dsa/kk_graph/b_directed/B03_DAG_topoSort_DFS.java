package org.example.dsa.kk_graph.b_directed;

import java.util.ArrayList;
import java.util.Stack;

import org.example.dsa.kk_graph.DirectedGraph;

/**
 * ***************************************************************************************
 * [DAG] Topo Sort using DFS
 * ***************************************************************************************
 */

public class B03_DAG_topoSort_DFS {
	
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
		
		boolean visited[] = new boolean[vertices];
		Stack<Integer> stack = new Stack<>(); 
		dfs(0, visited, stack);
		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}
	}
	
	
	// populates the topological sequence using DFS
	private static void dfs(int current, boolean visited[], Stack<Integer> stack) {
		visited[current] = true;
		
		for (int adjNode : adj[current]) {
			if (!visited[adjNode]) {				// if the adjacent node is not visited earlier
				dfs(adjNode, visited, stack);
			}
		}
		stack.push(current);						// at the end of each recursion call, push the current element in stack
	}
	
}
