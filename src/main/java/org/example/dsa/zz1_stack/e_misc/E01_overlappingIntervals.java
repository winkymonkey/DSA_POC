package org.example.dsa.zz1_stack.e_misc;

/**
 * ********************************************************************************
 * Merge Overlapping Intervals
 * ********************************************************************************
 * Given a set of time intervals in any order, merge all overlapping intervals into one 
 * and output the result which should have only mutually exclusive intervals.
 * Let the intervals be represented as pairs of integers for simplicity. 
 * 
 * let the given set of intervals be {{1,3}, {2,4}, {5,7}, {6,8}}.
 * The intervals {1,3} and {2,4} overlap with each other, so they should be merged and become {1,4}
 * Similarly, {5,7} and {6,8} should be merged and become {5,8}
 * 
 * ********************************************************************************
 */

public class E01_overlappingIntervals {
	/*
	 * class Interval implements Comparable<Interval> {
	 *    int startTime;
	 *    int endTime;
	 *    
	 *    public int compareTo() {
	 *       return this.startTime - interval.startTime;
	 *    }
	 * }
	 * 
	 * Interval A[];
	 * Interval i1 = new Interval(6,8);
	 * Interval i2 = new Interval(1,9);
	 * Interval i3 = new Interval(2,4);
	 * Interval i4 = new Interval(4,7);
	 * 
	 * 
	 * 
	 * ------------------
	 * --Sort the array based on the starting time
	 * Arrays.sort(A);		//(1,9),(2,4),(4,7),(6,8)
	 * 
	 * 
	 * --Push first interval into Stack
	 * stack.push(A[0]);
	 * 
	 * 
	 * for (i=1 to n) {
	 *    if (top.endTime < A[i].start) {					//the current interval DOESN'T overlap with the last interval
	 *       stack.push(A[i])								//push current interval into stack
	 * 	  }
	 * 	  else {
	 *       if (ending time of current interval > ending time of stack.top) {
	 *          ending time of stack.top = ending time of current interval;
	 *       }
	 *       else {
	 *          discard current interval
	 *       }
	 *    }
	 * }
	 * 
	 * At the end stack contains the merged intervals.
	 * TIME --- O(nLogn)
	 * 
	 * 
	 * 
	 * 
	 * -----------------------------
	 * ---MORE EFFICIENT APPROACH---
	 * -----------------------------
	 * In above problem, the sorting takes time of O(nLog(n)) & merging happens in O(n) time
	 * But the merge process takes O(n) extra space.
	 * 
	 * We can reduce the space, if we can do in-place merging
	 * 
	 */
}
