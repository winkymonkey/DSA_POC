package org.example.dsa.hh_graph.e_problems;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * *************************************************************************************
 * Minimum steps to reach target by a Knight
 * *************************************************************************************
 * A knight has below valid moves
 *    - - - - - - -
 *    - - G - F - -
 *    - H - - - E -
 *    - - - K - - -
 *    - A - - - D -
 *    - - B - C - -
 *    - - - - - - -
 * And the positions are (starting from A) ---- {-2,-1},{-1,-2},{1,-2},{2,-1},{2,1},{1,2},{-1,2},{-2,1}
 * 
 * 
 * The Knight 'K' starts from (4,5) and it has to reach the destination 'D' (1,1)
 * 
 *    - - - - - - - - -
 *    - - - - - - - - -
 *    - - - - - - - - -
 *    - - - - K - - - -
 *    - - - - - - - - -
 *    - - - - - * - - -
 *    - - - * - - - - -
 *    - D - - - - - - -
 * 
 * Ans:
 * (4,5) -> (5,3) -> (3,2) -> (1,1)
 * 
 * *************************************************************************************
 */

public class E02_minStepsToReachTargetByKnight {
	/*
	 * This problem can be seen as shortest path in unweighted graph.
	 * Therefore we use BFS to solve this problem. 
	 */
	
	private static final int xSize = 30;
	private static final int ySize = 30;
	
	public static void main(String[] args) {
		Cell knightPos = new Cell(0, 0, -1);
		Cell targetPos = new Cell(29, 29, -1);
		System.out.println(minStepToReachTarget(knightPos, targetPos));
	}
	
	
	private static int minStepToReachTarget(Cell knightPos, Cell targetPos) {
		// x and y direction, where a knight can move
		int dx[] = { -2, -1,  1,  2, 2, 1, -1, -2 };
		int dy[] = { -1, -2, -2, -1, 1, 2,  2,  1 };

		Queue<Cell> queue = new LinkedBlockingQueue<>();
		queue.add(new Cell(knightPos.x, knightPos.y, 0));

		boolean visited[][] = new boolean[xSize][ySize];
		visited[knightPos.x][knightPos.y] = true;				// visit starting position

		while (!queue.isEmpty()) {
			Cell current = queue.poll();

			if (current.x == targetPos.x && current.y == targetPos.y)
				return current.dist;

			for (int i=0; i<8; i++) {							// loop for all reachable states
				int x = current.x + dx[i];
				int y = current.y + dy[i];

				if (x >= 0 && x < xSize && y >= 0 && y < ySize && !visited[x][y]) {
					visited[x][y] = true;
					queue.add(new Cell(x, y, current.dist+1));
				}
			}
		}
		return Integer.MAX_VALUE;
	}
	
	
	static class Cell {
		int x, y;
		int dist;

		public Cell(int x, int y, int dist) {
			this.x = x;
			this.y = y;
			this.dist = dist;
		}
	}
	
}
