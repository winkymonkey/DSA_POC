package org.example.dsa.ee_dynamicprog;

/**
 * ***************************************************************************************
 * Word wrap problem
 * ***************************************************************************************
 * An array NUM[] is given which contains the length of some random words.
 * Let "WIDTH" be the limit on the number of characters that can be put in one line.
 * Your job is to put line breaks in the given sequence such that the lines are printed as neatly as possible.
 * 
 * Assume that the length of each word is smaller than the line width.
 * When line breaks are inserted, there is a possibility that extra spaces are present in each line.
 * The extra spaces include spaces put at the end of every line "except the last one"
 * 
 * In order to print lines as neatly as possible, you have to minimize the cost where
 * COST = Sum of cost of each line
 * 		= (num of spaces in line1)^3 + (num of spaces in line2)^3 + (num of spaces in line3)^3 + ......
 *  
 * ***************************************************************************************
 * Input:  NUMS = {3, 2, 2, 5}		WIDTH=6			// {aaa, bb, cc, ddddd}
 * Output: 10
 * 
 * line-1--- word1 ============= total 3chars --------------------------> 3 spaces at end
 * line-2--- word2 + word3 ===== total 5chars (2char+1space+2char)------> 1 spaces at end
 * line-3--- word4 ============= total 5chars --------------------------> 1 spaces at end	//ignore the spaces at the end of last line.
 * COST = 3^3 + 1^3 = 28
 * 
 * Possibility:2
 * 		line-1--- word1 + word2 ===== total 6chars (3char+1space+2char)------> 0 spaces at end 
 * 		line-2--- word3 ============= total 2chars --------------------------> 4 spaces at end
 * 		line-3--- word4 ============= total 5chars --------------------------> 1 spaces at end	//ignore the spaces at the end of last line.
 * 		COST = 0^3 + 4^3 = 64
 * 
 * No other possibilities are there.
 * So minimum COST is 28
 * ***************************************************************************************
 */

public class A05_wordWrapProblem {
	
	/*
	 * --------------------
	 * ---NAIVE APPROACH---
	 * --------------------
	 * We can follow greedy approach.
	 * We become greedy and try to put as many words as possible in a single line.
	 * When a line is full, then we come to next line.
	 * 
	 * Greedy Approach:
	 * 	- line-1---> word1+word2 ===== 6chars (3char+1space+2char)------> 0 extra spaces at end
	 * 	- line-2---> word3 =========== 2chars --------------------------> 4 extra spaces at end
	 * 	- line-3---> word4 =========== 5chars --------------------------> 1 extra spaces at end	//ignore the spaces at the end of last line.
	 * 
	 * COST = 0^3 + 4^3 = 64
	 * 
	 * ----------------
	 * In many cases, this greedy approach can produce optimal arrangement.
	 * But not always.
	 * 
	 * Let us consider a non-greedy arrangement:
	 *  - line-1---> word1 =========== 3chars --------------------------> 3 extra spaces at end
	 * 	- line-2---> word2+word3 ===== 5chars (2char+1space+2char)------> 1 extra spaces at end
	 * 	- line-3---> word4 =========== 5chars --------------------------> 1 extra spaces at end	//ignore the spaces at the end of last line.
	 * 
	 * COST = 3^3 + 1^3 = 28
	 * 
	 * 
	 * 
	 * ------------------------
	 * ---EFFICIENT APPROACH---
	 * ------------------------
	 * In a line, we can put 1word OR 2words OR 3words OR .....etc. as long as the line width permits.
	 * For each possibilities, we will end up having different cost value.
	 * And this can be done repeatedly for each lines.
	 * 
	 * So our objective should be --- for each line, pick the possibility which gives us the minimum cost
	 * It will ensure minimum value of the overall cost.
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	private static final Integer INFINITY = Integer.MAX_VALUE;
	
	public static void main(String args[]) {
		int A[] = { 3, 2, 2, 5 };
		int lineSize = 6;
		calculate(A, lineSize);
	}
	
	
	private static void calculate(int A[], int lineWidth) {
		int n = A.length;
		
		int extraSpace[][] = new int[n][n];				// store the number of extra spaces for i lines and j columns
		int cost[][] = new int[n][n];					// store the cost of i lines and j columns
		int path[] = new int[n];						// store the min cost of word arrangement in each lines
		int minCost[] = new int[n];						// store the the path
		
		
		// Calculate extra spaces in i-th line
		for (int i = 0; i < n; i++) {
			extraSpace[i][i] = lineWidth - A[i];						// extra space after putting the current word
			for (int j = i + 1; j < n; j++) {
				extraSpace[i][j] = extraSpace[i][j-1] - A[j] - 1;		// extra space after putting subsequent words
			}
		}
		
		
		// Calculate the cost of each line based on extra spaces it contains
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				if (extraSpace[i][j] < 0) {								// If extra space is -ve
					cost[i][j] = INFINITY;								// so a line cannot contain this combination of words
				}
				else if (j==n-1 && extraSpace[i][j] >= 0) {				// If it's the last word & still there are extra spaces after it
					cost[i][j] = 0;										// these extra space doesn't contribute in calculating lineCost
				}
				else {													// If cost is +ve or 0
					cost[i][j] = extraSpace[i][j] * extraSpace[i][j]; 	// then square that which will be the cost
				}
			}
		}
		
		
		// Calculate minimum cost and find minimum cost arrangement.	// minCost[0] will contain the overall cost
		for (int i = n-1; i >= 0; i--) {
			minCost[i] = cost[i][n-1];
			path[i] = n;
			for (int j = n-1; j > i; j--) {
				if (cost[i][j-1] == INFINITY) {							// cost of i'th line having j-1 words is already infinity
					continue;											// then it does not make any sense to add more words in this line
				}
				if (minCost[i] > cost[i][j-1] + minCost[j]) {			// If the value of minCost[i] can be minimized using by changing the line at index "j"
					minCost[i] = cost[i][j-1] + minCost[j];				// updated cost of i'th line = cost of i'th line having j-1 words + cost of j'th word
					path[i] = j;
				}
			}
		}
		
		for (int i = 0; i < n; i = path[i]) {
			System.out.println("From word no. "+(i+1)+" to "+path[i]);
		}
	}
	
}
