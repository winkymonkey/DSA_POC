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
	
	private static Vector<String> possiblePaths = new Vector<>();
	private static String path = "";
	private static final int MAX = 5;
	
	
	public static void main(String[] args) {
		int arr[][] = { { 1, 0, 0, 0, 0 }, 
						{ 1, 1, 1, 1, 1 }, 
						{ 1, 1, 1, 0, 1 }, 
						{ 0, 0, 0, 0, 1 }, 
						{ 0, 0, 0, 0, 1 } };
		int n = arr.length;
		boolean[][] visited = new boolean[n][MAX];

		findPath(0, 0, arr, n, visited);
		possiblePaths.forEach(str -> System.out.print(str+" "));
	}
	
	
	private static void findPath(int row, int col, int arr[][], int n, boolean visited[][]) {
		if (row == -1 || row == n || col == -1 || col == n || visited[row][col] || arr[row][col] == 0)
			return;
		
		if (row == n-1 && col == n-1) {
			possiblePaths.add(path);
			return;
		}
		
		visited[row][col] = true;								// Mark the cell as visited
		
		if (isValidMove(row+1, col, arr, n, visited)) {			// Check if downward move is valid
			path += 'D';
			findPath(row+1, col, arr, n, visited);
			path = path.substring(0, path.length()-1);
		}

		if (isValidMove(row, col-1, arr, n, visited)) {			// Check if the left move is valid
			path += 'L';
			findPath(row, col-1, arr, n, visited);
			path = path.substring(0, path.length()-1);
		}

		if (isValidMove(row, col+1, arr, n, visited)) {			// Check if the right move is valid
			path += 'R';
			findPath(row, col+1, arr, n, visited);
			path = path.substring(0, path.length()-1);
		}

		if (isValidMove(row-1, col, arr, n, visited)) {			// Check if the upper move is valid
			path += 'U';
			findPath(row-1, col, arr, n, visited);
			path = path.substring(0, path.length()-1);
		}
		
		visited[row][col] = false;								// Mark the cell as unvisited for other possible paths
	}
	
	
	// It returns true if the move taken is valid else it will return false
	private static boolean isValidMove(int row, int col, int arr[][], int n, boolean visited[][]) {
		if (row == -1 || row == n || col == -1 || col == n || visited[row][col] || arr[row][col] == 0)
			return false;
		
		return true;
	}
	
}
