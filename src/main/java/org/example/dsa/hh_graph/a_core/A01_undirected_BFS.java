package org.example.dsa.hh_graph.a_core;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import org.example.dsa.hh_graph.MyGraph;

/**
 * ***************************************************************************************
 * BFS for a Graph
 * ***************************************************************************************
 * https://www.geeksforgeeks.org/breadth-first-search-or-bfs-for-a-graph/
 * ***************************************************************************************
 */

public class A01_undirected_BFS {
	
	private static final int vertices = 4;
	private static ArrayList<Integer> adj[];
	
	
	public static void main(String[] args) {
		MyGraph graph = new MyGraph(vertices);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 2);
		graph.addEdge(2, 0);
		graph.addEdge(2, 3);
		graph.addEdge(3, 3);
		graph.printGraph();
		adj = graph.adj;
		
		boolean visited[] = new boolean[vertices];
		printBFS(2, visited);
	}
	
	
	private static void printBFS(int start, boolean visited[]) {
		Queue<Integer> queue = new LinkedBlockingQueue<>();

		visited[start] = true;
		queue.add(start);

		while (queue.size() != 0) {
			int polled = queue.poll();
			System.out.print(polled + " ");

			for (int num : adj[polled]) {
				if (!visited[num]) {
					visited[num] = true;
					queue.add(num);
				}
			}
		}
	}
	
}
