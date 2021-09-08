package org.example.dsa.gg_heap.c_search;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * ***************************************************************************************
 * Median in a stream of integers (running integers)
 * ***************************************************************************************
 * Median means ---
 *   if the input size is odd --- Median = middle element of sorted stream
 *   if the input size is even -- Median = average of two middle elements of sorted stream
 * 
 * Example:
 * A Stream of 5, 15, 1, 3
 * 		After reading 1st element of stream -- 5           -> median -- 5
 * 		After reading 2nd element of stream -- 5, 15       -> median -- 10
 * 		After reading 3rd element of stream -- 5, 15, 1    -> median -- 5
 * 		After reading 4th element of stream -- 5, 15, 1, 3 -> median -- 4
 * 
 * ***************************************************************************************
 */

public class C04_findMedianFromStreamOfIntegers {
	/*
	 * ----------------
	 * Use 2 heaps
	 * 	- A MaxHeap that contains the smaller half of the elements, with the maximum element at the root
	 *  - A MinHeap that contains the larger half of the elements, with the minimum element at the root
	 * 
	 * 
	 * ------
	 * A[]					//length 100
	 * minHeap[]			//length 100
	 * maxHeap[]			//length 100
	 * 
	 * currentMedian = 0
	 * 
	 * FOR each incoming elements {
	 *    IF (incomingElement < currentMedian) {
	 *       add incomingElement to the end of MaxHeap
	 *       if (MaxHeap end element > MaxHeap root)
	 *          swap them									//making sure the MaxHeap has maximum value at the root
	 *    }
	 *    ELSE {
	 *       add incomingElement to the end of MinHeap
	 *       IF (MinHeap end element < MinHeap root)
	 *          swap them									//making sure the MinHeap has minimum value at the root
	 *    }
	 *    
	 *    
	 *    //balancing both the heaps
	 *    IF (Number of elements in MaxHeap - Number of elements in MinHeap > 1) {
	 *       remove root of MaxHeap and add it to the end of MinHeap
	 *       IF (MinHeap end element < MinHeap root)
	 *       	swap them
	 *    }
	 *    ELSE IF (Number of elements in MinHeap - Number of elements in MaxHeap > 1) {
	 *       remove root of MinHeap and add it to the end of MaxHeap
	 *       IF (MaxHeap end element > MaxHeap root)
	 *          swap them
	 *    }
	 *    
	 *    
	 *    IF both the heaps contain equal amount of elements
	 *       median = (root of maxHeap + root of minHeap) / 2
	 *    ELSE
	 *       median = root of the heap with more elements
	 * }
	 * 
	 */
	
	public static void main(String[] args) {
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());	// contains smaller half of the elements, with the maximum element at the root
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();								// contains larger half of the elements, with the minimum element at the root
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			processInteger(sc.nextInt(), maxHeap, minHeap);
			double median = getMedian(maxHeap, minHeap);
			System.out.println(median);
		}
	}
	
	
	private static  void processInteger(int num, PriorityQueue<Integer> maxHeap, PriorityQueue<Integer> minHeap) {
		if (!minHeap.isEmpty() && num < minHeap.peek()) {
			maxHeap.offer(num);
			if (maxHeap.size() > minHeap.size() + 1) {
				minHeap.offer(maxHeap.poll());
			}
		} else {
			minHeap.offer(num);
			if (minHeap.size() > maxHeap.size() + 1) {
				maxHeap.offer(minHeap.poll());
			}
		}
	}
	
	
	private static double getMedian(PriorityQueue<Integer> maxHeap, PriorityQueue<Integer> minHeap) {
        int median;
        if (minHeap.size() < maxHeap.size()) {					// if maxHeap is bigger, take its root as median
            median = maxHeap.peek();
        } else if (minHeap.size() > maxHeap.size()) {			// if minHeap is bigger, take its root as median
            median = minHeap.peek();
        } else {
            median = (minHeap.peek() + maxHeap.peek()) / 2;		// if both are of same size, take average of both the roots
        }
        return median;
    }
	
}
