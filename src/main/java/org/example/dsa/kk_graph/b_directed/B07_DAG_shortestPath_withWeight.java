package org.example.dsa.kk_graph.b_directed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

import org.example.dsa.kk_graph.DirectedWeightedGraph;
import org.example.dsa.kk_graph.Node;

/**
 * ***************************************************************************************
 * [DAG] Shortest path (with weight)
 * ***************************************************************************************
 */

public class B07_DAG_shortestPath_withWeight {
	
	private static final int vertices = 6;
	private static ArrayList<Node> adj[];
	
	
	public static void main(String[] args) {
		DirectedWeightedGraph graph = new DirectedWeightedGraph(vertices);
		graph.addEdge(0,1, 2);
		graph.addEdge(0,4, 1);
		graph.addEdge(1,2, 3);
		graph.addEdge(2,3, 6);
		graph.addEdge(4,2, 2);
		graph.addEdge(4,5, 4);
		graph.addEdge(5,3, 1);
		graph.printGraph();
		adj = graph.adj;
		
		boolean visited[] = new boolean[vertices];
		Stack<Integer> stack = new Stack<>();
		dfs(0, visited, stack);
		
		int distance[] = new int[vertices];
		Arrays.fill(distance, Integer.MAX_VALUE);
		shortestPath(0, distance, stack);
		System.out.println(Arrays.toString(distance));
	}
	
	
	// populates the topological sequence using DFS
	private static void dfs(int current, boolean visited[], Stack<Integer> stack) {
		visited[current] = true;
		
		for (Node adjNode : adj[current]) {
			if (!visited[adjNode.val]) {				// if the adjacent node is not visited earlier
				dfs(adjNode.val, visited, stack);
			}
		}
		stack.push(current);							// at the end of each recursion call, push the current element in stack
	}
	
	
	// for each element in topological sequence, find adjacency list. For each adjacent element, update the distance array with min possible value
	private static void shortestPath(int current, int distance[], Stack<Integer> stack) {
		distance[current] = 0;
		
		while (!stack.isEmpty()) {
			current = stack.pop();
			if (distance[current] != Integer.MAX_VALUE) {
				for (Node adjNode : adj[current]) {
					if (distance[current] + adjNode.weight < distance[adjNode.val]) {
						distance[adjNode.val] = distance[current] + adjNode.weight;
					}
				}
			}
		}
	}
	
}
