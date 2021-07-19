package org.example.dsa.hh_graph.a_core;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.example.dsa.hh_graph.MyGraph;


public class A_BFS {
	
	private static final int vertices = 5;
	
	public static void main(String[] args) {
		MyGraph graph = new MyGraph(vertices);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 2);
		graph.addEdge(2, 0);
		graph.addEdge(2, 3);
		graph.addEdge(3, 3);
		
		printBFS(2, graph.adjList);
	}
	
	
	private static void printBFS(int start, List<List<Integer>> adjList) {
		boolean visited[] = new boolean[vertices];
		Queue<Integer> queue = new LinkedList<>();
		visited[start] = true;
		queue.add(start);

		while (queue.size() != 0) {
			start = queue.poll();
			System.out.print(start+" ");
			
			Iterator<Integer> itr = adjList.get(start).listIterator();
			while (itr.hasNext()) {
				int num = itr.next();
				if (!visited[num]) {
					visited[num] = true;
					queue.add(num);
				}
			}
		}
	}
	
}
