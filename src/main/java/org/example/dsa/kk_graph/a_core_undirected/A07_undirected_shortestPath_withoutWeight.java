package org.example.dsa.kk_graph.a_core_undirected;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

import org.example.dsa.kk_graph.UndirectedGraph;

/**
 * ***************************************************************************************
 * [Undirected] Shortest Path (without weight)
 * ***************************************************************************************
 * 
 *    1 -- 0 -- 3
 *    |  /      |
 *    | /       |
 *    2         4
 * 
 * ***************************************************************************************
 */

public class A07_undirected_shortestPath_withoutWeight {
	
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
		
		int distance[] = new int[vertices];		Arrays.fill(distance, Integer.MAX_VALUE);
		bfs(0, distance);
		System.out.println(Arrays.toString(distance));
	}
	
	
	// for each element find adjacency list. In BFS style, for each adjacent element, update the distance array with min possible value
	private static void bfs(int current, int distance[]) {
		Queue<Integer> queue = new LinkedBlockingQueue<>();
		queue.add(current);
		distance[current] = 0;
		
		while (!queue.isEmpty()) {
			current = queue.poll();
			for (int adjNode : adj[current]) {
				if (distance[current]+1 < distance[adjNode]) {
					distance[adjNode] = distance[current]+1;
					queue.add(adjNode);
				}
			}
		}
	}
	
}
