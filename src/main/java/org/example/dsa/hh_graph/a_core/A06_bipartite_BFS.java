package org.example.dsa.hh_graph.a_core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import org.example.dsa.hh_graph.UndirectedGraph;

/**
 * ***************************************************************************************
 * Undirected Graph: bipartite graph using BFS (graph coloring)
 * ***************************************************************************************
 */

public class A06_bipartite_BFS {
	
	private static final int vertices = 5;
	private static ArrayList<Integer> adj[];
	
	
	public static void main(String[] args) {
		UndirectedGraph graph = new UndirectedGraph(vertices);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(2, 1);
		graph.addEdge(0, 3);
		graph.addEdge(3, 4);
		graph.printGraph();
		adj = graph.adj;
		
		int color[] = new int[vertices];		Arrays.fill(color, -1);
		printBFS(0, color);
	}
	
	
	private static boolean printBFS(int current, int color[]) {
		Queue<Integer> queue = new LinkedBlockingQueue<>();
		queue.add(current);
		color[current] = 1;

		while (queue.size() != 0) {
			current = queue.poll();
			System.out.print(current + " ");

			for (int adjNode : adj[current]) {
				if (color[adjNode] == -1) {						// if the adjacent node is not colored earlier
					color[adjNode] = 1-color[current];
					queue.add(adjNode);
				}
				else if (color[adjNode] == color[current]) {	// if the adjacent node is already colored but it's the same color as current, then it's not bipartite
					return false;
				}
			}
		}
		return true;
	}
	
}

