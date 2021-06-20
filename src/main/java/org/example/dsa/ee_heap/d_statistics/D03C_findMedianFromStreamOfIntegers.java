package org.example.dsa.ee_heap.d_statistics;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;


public class D03C_findMedianFromStreamOfIntegers {

	public static void main(String[] args) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
		
		Scanner sc = new Scanner(System.in);
		while (true) {
			processInteger(sc.nextInt(), minHeap, maxHeap);
			double median = getMedian(minHeap, maxHeap);
			System.out.println(median);
		}
	}
	
	
	private static  void processInteger(int num, PriorityQueue<Integer> minHeap, PriorityQueue<Integer> maxHeap) {
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
	
	
	private static double getMedian(PriorityQueue<Integer> minHeap, PriorityQueue<Integer> maxHeap) {
        int median;
        if (minHeap.size() < maxHeap.size()) {
            median = maxHeap.peek();
        } else if (minHeap.size() > maxHeap.size()) {
            median = minHeap.peek();
        } else {
            median = (minHeap.peek() + maxHeap.peek()) / 2; 
        }
        return median;
    }
	
}
