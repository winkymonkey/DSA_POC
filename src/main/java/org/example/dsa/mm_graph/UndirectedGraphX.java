package org.example.dsa.mm_graph;


public class UndirectedGraphX {
	
	public int vertices, edges;
	public int matrix[][];

	public UndirectedGraphX(int vertices, int edges) {
		this.vertices = vertices;
		this.edges = edges;
		this.matrix = new int[vertices][vertices];
	}
	
	public void addEdge(int u, int v) {
		matrix[u][v] = 1;
		matrix[v][u] = 1;
	}
	
	public void printGraph() {
		for (int i=0; i<vertices; i++) {
			for (int j=0; j<vertices; j++) {
				System.out.print(matrix[i][j]+", ");
			}
			System.out.println();
		}
	}
	
}
