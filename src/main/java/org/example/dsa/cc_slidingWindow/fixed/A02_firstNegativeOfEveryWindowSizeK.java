package org.example.dsa.cc_slidingWindow.fixed;

import java.util.LinkedList;
import java.util.Queue;

/**
 * ***************************************************************************************
 * Find first negative number of every window of size K
 * (If no negative number exists in any window, consider it to be 0)
 * ***************************************************************************************
 * Input:  { 12, -1, -7, 8, -15, 30, 16, 28 }
 * Output: -1, -1, -7, -15, -15, 0
 * ***************************************************************************************
 */

public class A02_firstNegativeOfEveryWindowSizeK {
	/*
	 * --------------------
	 * This is a fixed sliding window problem
	 * 		window start --- i
	 * 		window end ----- j
	 * 		window size ---- j-i+1
	 * 
	 * 
	 * -------------
	 * ■ Initial Calculation
	 * For each "j",
	 *    - if A[j] is -ve then we put in the refQueue.
	 * 
	 * ■ Answer Calculation
	 * As soon as we hit window size,
	 *    - refQueue's top element is added in the answer
	 * 
	 * ■ Slide Ahead
	 * As A[i] will be removed in next window,
	 *    - if A[i] is -ve, then remove it from refQueue before leaving the current window
	 *    - i++
	 *    - j++
	 * 
	 * 
	 * -------------
	 * TIME --- O(n)
	 * SPACE -- O(K)
	 * 
	 */
	
	public static void main(String[] args) {
		int A[] = { 12, -1, -7, 8, -15, 30, 16, 28 };
		int K = 3;
		solution(A, K);
	}
	
	
	private static final Queue<Integer> refQueue = new LinkedList<>();	// store all negative numbers in current widnow
	private static final Queue<Integer> answer = new LinkedList<>();
	
	private static void solution(int A[], int K) {
		int i = 0, j = 0;
		
		while (j < A.length) {
			if (A[j] < 0)
				refQueue.add(A[j]);
			
			if (j-i+1 < K) {
				j++;
			}
			else if (j-i+1 == K) {
				answer.add(refQueue.size() > 0 ? refQueue.peek() : 0);	// if refQueue contains some elements, then queue front will be the first negative number in this window
				
				if (A[i] < 0)											// as A[i] will be removed in next window, if A[i] is -ve then remove it from refQueue before leaving the current window
					refQueue.poll();
				i++;
				j++;
			}
		}
		answer.forEach(elem -> System.out.print(elem+", "));
	}
	
}
