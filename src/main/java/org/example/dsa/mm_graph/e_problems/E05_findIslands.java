package org.example.dsa.mm_graph.e_problems;

/**
 * ***************************************************************************************
 * Count number of islands
 * ***************************************************************************************
 */

public class E05_findIslands {

	public static void main(String[] args) {
		int arr[][] = new int[][] { { 1, 1, 0, 0, 0 }, 
								    { 0, 1, 0, 0, 1 }, 
								    { 1, 0, 0, 1, 1 }, 
								    { 0, 0, 0, 0, 0 },
								    { 1, 0, 1, 0, 1 } };
		findIslands(arr, 5, 5);
	}
	
	private static void findIslands(int arr[][], int m, int n) {
		boolean visited[][] = new boolean[5][5];
		
		int count = 0;
		for (int i=0; i<m; i++) {
			for (int j=0; j<m; j++) {
				if (!visited[i][j] && arr[i][j]==1) {
					dfs(arr, m, n, i, j, visited);
					count++;
				}
			}
		}
		System.out.println(count);
	}
	
	
	private static void dfs(int arr[][], int m, int n, int i, int j, boolean visited[][]) {
		if (i<0 || j<0 || i>=m || j>=n)					// if it's not outside the boundary, no need to proceed
			return;
		
		if (arr[i][j] == 0)								// if it's 0, no need to proceed because we are looking for islands made of 1
			return;
		
		if (!visited[i][j]) {
			visited[i][j] = true;
			dfs(arr, m, n, i+1, j, visited);
			dfs(arr, m, n, i-1, j, visited);
			dfs(arr, m, n, i, j+1, visited);
			dfs(arr, m, n, i, j-1, visited);
			dfs(arr, m, n, i+1, j+1, visited);
			dfs(arr, m, n, i-1, j-1, visited);
			dfs(arr, m, n, i+1, j-1, visited);
			dfs(arr, m, n, i-1, j+1, visited);
		}
	}
	
}
