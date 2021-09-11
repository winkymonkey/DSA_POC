package org.example.dsa.cc_slidingWindow.fixed;

import java.util.LinkedList;
import java.util.Queue;

/**
 * ***************************************************************************************
 * Find max of all subarray of size K
 * ***************************************************************************************
 * Input:  { 1, 3, -1, -3, 5, 3, 6, 7 }		K=3
 * Output: { 3, 3, 5, 5, 6, 7 }
 * ***************************************************************************************
 */

public class A04_maxOfAllSubarrayOfSizeK {
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
	 *    - if A[j] in greater than refQueue front, then keep polling elements from refQueue as long as these are smaller than A[j]
	 *    	because the queue elements which are smaller than A[j] will never be used again in future calculations
	 *    - add A[j] to the queue which will eventually be at front because all smaller elements are already removed.
	 * 
	 * ■ Answer Calculation
	 * As soon as we hit window size,
	 *    - front element of refQueue is to be added in the answer list. 
	 * 
	 * ■ Slide Ahead
	 * As A[i] will be removed in next window,
	 *    - if A[i] exists at the front of the refQueue, then we have to remove it 
	 *    	(NOTE: if A[i] is not at front, then it will never be anywhere because we add elements sequentially in queue)
	 *    - i++
	 *    - j++
	 * 
	 * 
	 * -------------
	 * TIME ---
	 * SPACE --
	 * 
	 */
	
	public static void main(String[] args) {
		int A[] = { 1, 3, -1, -3, 5, 3, 6, 7 };
		int K = 3;
		solution(A, K);
	}
	
	
	private static final Queue<Integer> refQueue = new LinkedList<>();
	private static final Queue<Integer> answer = new LinkedList<>();
	
	private static void solution(int A[], int K) {
		int i = 0, j = 0;
		
		while (j < A.length) {
			while (refQueue.size()>0 && A[j] > refQueue.peek()) {		// A[j] is greater than queue front
				refQueue.poll();										// keep polling elements smaller than A[j] so that we can keep A[j] at front. Because the queue elements which are smaller than A[j] will never be used again in future calculations
			}
			refQueue.add(A[j]);											// add A[j] which will eventually be at front
			
			if (j-i+1 < K) {
				j++;
			}
			else if (j-i+1 == K) {
				answer.add(refQueue.peek());							// as soon as we hit window size, refQueue's front is the max of this window
				
				if (A[i] == refQueue.peek())
					refQueue.poll();
				i++;
				j++;
			}
		}
		answer.forEach(elem -> System.out.print(elem+", "));
	}
	
}
