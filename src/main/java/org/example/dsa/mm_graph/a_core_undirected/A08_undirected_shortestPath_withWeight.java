package org.example.dsa.mm_graph.a_core_undirected;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

import org.example.dsa.mm_graph.Node;
import org.example.dsa.mm_graph.UndirectedGraphWeighted;

/**
 * ***************************************************************************************
 * [Undirected] Shortest Path (with weight) (Dijkstra algorithm)
 * ***************************************************************************************
 *        2     5
 *     0 --- 1 --- 4
 *     |     |   /
 *    1|    4|  /1
 *     |     | /
 *     3 --- 2
 *        3
 * ***************************************************************************************
 */

public class A08_undirected_shortestPath_withWeight {
	
	private static final int vertices = 5;
	private static ArrayList<Node> adj[];
	
	
	public static void main(String[] args) {
		UndirectedGraphWeighted graph = new UndirectedGraphWeighted(vertices);
		graph.addEdge(0,1, 2);
		graph.addEdge(1,2, 4);
		graph.addEdge(0,3, 1);
		graph.addEdge(3,2, 3);
		graph.addEdge(1,4, 5);
		graph.addEdge(2,4, 1);
		graph.printGraph();
		adj = graph.adj;
		
		int distance[] = new int[vertices];		Arrays.fill(distance, Integer.MAX_VALUE);
		bfs(new Node(0,0), distance);
		System.out.println(Arrays.toString(distance));
	}
	
	
	// for each element find adjacency list. In BFS style, for each adjacent element, update the distance array with min possible value
	private static void bfs(Node current, int distance[]) {
		PriorityQueue<Node> queue = new PriorityQueue<>( (n1,n2)->(n1.weight-n2.weight) );
		queue.add(current);
		distance[current.val] = 0;
		
		while (!queue.isEmpty()) {
			current = queue.poll();
			for (Node adjNode : adj[current.val]) {
				if (distance[current.val]+adjNode.weight < distance[adjNode.val]) {
					distance[adjNode.val] = distance[current.val]+adjNode.weight;
					queue.add(new Node(adjNode.val, distance[adjNode.val]));
				}
			}
		}
	}
	
}
