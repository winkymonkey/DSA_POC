package org.example.dsa.ee_heap.d_statistics;

import java.util.Scanner;


public class D03B_findMedianFromStreamOfIntegers {
	
	private static final int inputCount = 10000;
	
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	
    	int maxHeap[] = new int[inputCount/2];
		int minHeap[] = new int[inputCount/2];
		int maxHeapSize = 0;
		int minHeapSize = 0;
        float median = 0;
    	
    	try {
	        for (int i=0; i<inputCount; i++) {
				int input = sc.nextInt();
				
				if (input < median) {
					maxHeap[maxHeapSize] = input;							// MaxHeap: add new element at last
					maxHeapSize++;											// MaxHeap: increase size
					if (maxHeap[maxHeapSize-1] > maxHeap[0]) { 				// MaxHeap: if last element > 1st element
						swap(maxHeap, maxHeapSize-1, 0); 					// MaxHeap: swap last & 1st element (ensure MaxHeap maintains maximum value at the root)
					}
				}
				else {
					minHeap[minHeapSize] = input;							// MinHeap: add new element at last
					minHeapSize++;											// MinHeap: increase size
					if (minHeap[minHeapSize-1] < minHeap[0]) { 				// MinHeap: if last element < 1st element
						swap(minHeap, minHeapSize - 1, 0); 					// MinHeap: swap last & 1st element (ensure MinHeap maintains minimum value at the root)
					}
				}
				
				// if the size difference of both the heaps is more than 1
				if (Math.abs(maxHeapSize - minHeapSize) > 1) {
					if (maxHeapSize > minHeapSize) {
						swap(maxHeap, maxHeapSize-1, 0); 					// MaxHeap: swap last & 1st element
						minHeap[minHeapSize] = maxHeap[--maxHeapSize];		// MaxHeap: detach last element from MaxHeap and put it at last of MinHeap
						minHeapSize++;										// MinHeap: increase size
						
						swap(minHeap, 0, minHeapSize-1);					// MinHeap: swap 1st & last element
						for (int k = (maxHeapSize/2)-1;  k>= 0; k--) {		// MaxHeap: rebuild heap structure
							maxHeapify(maxHeap, k, maxHeapSize);
						}
					}
					else {
						swap(minHeap, minHeapSize-1, 0);					// MinHeap: swap last & 1st element
						maxHeap[maxHeapSize] = minHeap[--minHeapSize];		// MinHeap: detach last element from MinHeap and put it at last of MaxHeap
						maxHeapSize++;										// MaxHeap: increase size
						
						swap(maxHeap, 0, maxHeapSize-1);					// MaxHeap: swap 1st & last element
						for (int k = (minHeapSize/2)-1; k>= 0; k--) {		// MinHeap: rebuild heap structure
							minHeapify(minHeap, k, minHeapSize);
						}
					}
				}
				
				if (maxHeapSize == minHeapSize) {
					median = (minHeap[0] + maxHeap[0]) / 2;
	        	}
				else if (maxHeapSize > minHeapSize) {
					median = maxHeap[0];
				}
				else {
					median = minHeap[0];
				}
				
				System.out.println(median);
	        }
    	}
    	finally {
    		sc.close();
    	}
    }
    
    
	private static void maxHeapify(int[] input, int i, int heapSize) {
		int left = 2*i + 1;
		int right = 2*i + 2;
		int largest = i;

		if (left < heapSize && input[left] > input[largest]) {
			largest = left;
		}
		if (right < heapSize && input[right] > input[largest]) {
			largest = right;
		}
		if (largest != i) {
			swap(input, i, largest);
			maxHeapify(input, largest, heapSize);
		}
	}
	
	
	private static void minHeapify(int[] input, int i, int heapSize) {
		int left = 2*i + 1;
		int right = 2*i + 2;
		int smallest = i;

		if (left < heapSize && input[left] < input[smallest]) {
			smallest = left;
		}
		if (right < heapSize && input[right] < input[smallest]) {
			smallest = right;
		}
		if (smallest != i) {
			swap(input, i, smallest);
			minHeapify(input, smallest, heapSize);
		}
	}
	
	
	private static void swap(int[] input, int pos1, int pos2) {
		if (pos1 == pos2)
			return;
		int temp = input[pos1];
		input[pos1] = input[pos2];
		input[pos2] = temp;
	}
    
}