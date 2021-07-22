package org.example.dsa.hh_graph.b_problems;

import java.util.*;

/**
 * *************************************************************************************
 * Search in a Maze
 * *************************************************************************************
 * Consider a rat placed at (0,0) in a square matrix of order N*N
 * It has to reach the destination at (N-1, N-1).
 * Find all possible paths that the you can take to reach from source to destination.
 * The directions in which the rat can move are 'U'(up), 'D'(down), 'L'(left), 'R'(right).
 * Value 0 at a cell represents that it is blocked and you cannot move to it
 * Value 1 at a cell represents that you can be travel through it.
 * 
 * In a path, no cell can be visited more than one time.
 * 
 * 
 * - x x x x
 * - - - - -
 * - - - x -
 * x x x x -
 * x x x x -
 * 
 * 
 * *************************************************************************************
 */

public class B01_searchInMaze {
	/*
	 * Form a recursive function which will follow a path and check if the path reaches the destination or not.
	 * If the path does not reach the destination then backtrack and try other paths.
	 */
	
	private static Vector<String> possiblePaths = new Vector<>();
	private static String path = "";
	
	
	public static void main(String[] args) {
		int A[][] = { { 1, 0, 0, 0, 0 }, 
					  { 1, 1, 1, 1, 1 }, 
					  { 1, 1, 1, 0, 1 }, 
					  { 0, 0, 0, 0, 1 }, 
					  { 0, 0, 0, 0, 1 } };
		boolean[][] visited = new boolean[A.length][A[0].length];

		findPathDFS(0, 0, A, visited);
		possiblePaths.forEach(str -> System.out.print(str+" "));
	}
	
	
	private static void findPathDFS(int row, int col, int A[][], boolean visited[][]) {
		if (row == -1 || row == A.length || col == -1 || col == A.length || visited[row][col] || A[row][col] == 0)
			return;
		
		if (row == A.length-1 && col == A.length-1) {
			possiblePaths.add(path);
			return;
		}
		
		visited[row][col] = true;							// Mark the cell as visited
		
		if (isValidMove(row+1, col, A, visited)) {			// Check if the DOWN move is valid
			path += 'D';
			findPathDFS(row+1, col, A, visited);
			path = path.substring(0, path.length()-1);
		}

		if (isValidMove(row, col-1, A, visited)) {			// Check if the LEFT move is valid
			path += 'L';
			findPathDFS(row, col-1, A, visited);
			path = path.substring(0, path.length()-1);
		}

		if (isValidMove(row, col+1, A, visited)) {			// Check if the RIGHT move is valid
			path += 'R';
			findPathDFS(row, col+1, A, visited);
			path = path.substring(0, path.length()-1);
		}

		if (isValidMove(row-1, col, A, visited)) {			// Check if the UP move is valid
			path += 'U';
			findPathDFS(row-1, col, A, visited);
			path = path.substring(0, path.length()-1);
		}
		
		visited[row][col] = false;							// Mark the cell as unvisited for other possible paths. Otherwise you will get only 1 possible path as once a path is traversed, it cannot be traversed again
	}
	
	
	private static boolean isValidMove(int row, int col, int A[][], boolean visited[][]) {
		if (row == -1 || row == A.length || col == -1 || col == A.length || visited[row][col] || A[row][col] == 0)	// 0 means BLOCKER
			return false;
		else
			return true;
	}
	
}
