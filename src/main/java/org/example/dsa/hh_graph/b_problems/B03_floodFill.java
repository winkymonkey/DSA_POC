package org.example.dsa.hh_graph.b_problems;

/**
 * *************************************************************************************
 * Flood fill Algorithm - implement fill() in paint
 * *************************************************************************************
 * Input:
 * 	screen[M][N] = {{1,  1,  1,  1,  1,  1,  1,  1},
 * 					{1,  1,  1,  1,  1,  1,  0,  0},
 * 					{1,  0,  0,  1,  1,  0,  1,  1},
 * 					{1, (2),(2),(2),(2), 0,  1,  0},
 * 					{1,  1,  1, (2),(2), 0,  1,  0},
 * 					{1,  1,  1, (2),(2),(2),(2), 0},
 * 					{1,  1,  1,  1,  1, (2), 1,  1},
 * 					{1,  1,  1,  1,  1, (2),(2), 1}};
 * 
 * Replace the color of pixel {4,4} & its adjacent pixels by another color '3'.
 * 
 * Output: Screen should be changed to following
 *  screen[M][N] = {{1,  1,  1,  1,  1,  1,  1,  1},
 * 					{1,  1,  1,  1,  1,  1,  0,  0},
 * 					{1,  0,  0,  1,  1,  0,  1,  1},
 * 					{1, (3),(3),(3),(3), 0,  1,  0},
 * 					{1,  1,  1, (3),(3), 0,  1,  0},
 * 					{1,  1,  1, (3),(3),(3),(3), 0},
 * 					{1,  1,  1,  1,  1, (3), 1,  1},
 * 					{1,  1,  1,  1,  1, (3),(3), 1}};
 * 
 * *************************************************************************************
 */

public class B03_floodFill {
	
	public static void main(String[] args) {
		int screen[][] =   {{1, 1, 1, 1, 1, 1, 1, 1},
			                {1, 1, 1, 1, 1, 1, 0, 0},
			                {1, 0, 0, 1, 1, 0, 1, 1},
			                {1, 2, 2, 2, 2, 0, 1, 0},
			                {1, 1, 1, 2, 2, 0, 1, 0},
			                {1, 1, 1, 2, 2, 2, 2, 0},
			                {1, 1, 1, 1, 1, 2, 1, 1},
			                {1, 1, 1, 1, 1, 2, 2, 1}};
		int x = 4;
		int y = 4;
		int newColor = 3;
		
		int prevColor = screen[x][y];
		if (prevColor == newColor) {
			// nothing to do
		}
		else {
			floodFil(screen, x, y, prevColor, newColor);
		}

		System.out.println("Updated screen after call to floodFill: ");
		for (int i = 0; i < screen.length; i++) {
			for (int j = 0; j < screen[0].length; j++)
				System.out.print(screen[i][j] + " ");
			System.out.println();
		}
	}
	
	
	private static void floodFil(int screen[][], int x, int y, int prevColor, int newColor) {
		if (x < 0 || x >= screen.length || y < 0 || y >= screen[0].length)
			return;
		if (screen[x][y] != prevColor)						// pixel color is not the desired color that to be modified
			return;

		screen[x][y] = newColor;

		floodFil(screen, x+1, y, prevColor, newColor);
		floodFil(screen, x-1, y, prevColor, newColor);
		floodFil(screen, x, y+1, prevColor, newColor);
		floodFil(screen, x, y-1, prevColor, newColor);
	}

}
