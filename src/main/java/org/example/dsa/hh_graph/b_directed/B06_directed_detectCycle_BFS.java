package org.example.dsa.hh_graph.b_directed;

/**
 * ***************************************************************************************
 * Directed Graph: Detect cycle using BFS
 * ***************************************************************************************
 */

public class B06_directed_detectCycle_BFS {
	/*
	 * We know that topological sort is only possible for DAG
	 * Hence if a graph contains cycle, it is not possible to find topological sort
	 * 
	 * We can hire this concept to detect cycle
	 * Whenever we poll a element from queue we increment a COUNTER
	 * Once the queue becomes empty, if (COUNTER == number of nodes) ----- the graph doesn't contain a cycle
	 * Otherwise, the graph contains a cycle
	 */
}
