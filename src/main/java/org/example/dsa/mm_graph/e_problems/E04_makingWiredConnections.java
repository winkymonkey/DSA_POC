package org.example.dsa.mm_graph.e_problems;

/**
 * ***************************************************************************************
 * Making wired Connections
 * ***************************************************************************************
 * Given an integer N, denoting the number of computers connected by cables forming a network 
 * and a 2D array connections[][] where each row (i, j) representing a connection between i-th and j-th computer
 * Your task is to connect all the computers either directly or indirectly by removing any of the given connections and connecting two disconnected computers.
 * If it’s not possible to connect all the computers, print -1. 
 * Otherwise, print the minimum number of such operations required.
 * ***************************************************************************************
 */

public class E04_makingWiredConnections {
	/*
	 * -------------------
	 * Min edges to connect all nodes in a single component graph = (N-1)			// N = number of nodes in a graph
	 * Min edges to connect all components = (C-1)									// C = number of components in a graph
	 * 
	 * So min edges to connect all nodes in a multi component graph = [(N-1)-(C-1)]
	 * 
	 * Hence,
	 * if the number of components increases, the min edges required to connect the components decrease.
	 * 
	 * Redundant edges
	 * = Total Edges - Min edges to connect all nodes
	 * = E - [(N-1) - (C-1)]
	 * 
	 * -------------------
	 * Algorithm:
	 * 1. Create adjacency list & calculate total edges 'E'
	 * 2. Find number of components using DFS
	 * 3. Find number of redundant edges = E - [(N-1)-(C-1)]
	 * 
	 * If (redundant edges >= C-1) ------ then minimum C-1 edges should be relocated to make all components connected.
	 * 
	 * If (E < N-1) OR (redundant edges < C-1) ------ then sufficient edges are not available to relocate
	 * 
	 * -------------------
	 */
	
}
