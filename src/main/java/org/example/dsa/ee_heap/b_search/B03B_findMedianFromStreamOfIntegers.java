package org.example.dsa.ee_heap.b_search;

import java.util.Scanner;


public class B03B_findMedianFromStreamOfIntegers {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	try {
	        int input = sc.nextInt();
	        int A[] = new int[input];
	        
	        int minHeap[] = new int[input];
	        int maxHeap[] = new int[input];
	        int minHeapSize = 0;
	        int maxHeapSize = 0;
	
	        float currentMedian = 0;
	
	        for (int i = 0; i < input; i++) {
	            A[i] = sc.nextInt();
	            if (A[i] < currentMedian) {
	                maxHeap[maxHeapSize++] = A[i];
	                if (maxHeap[maxHeapSize - 1] > maxHeap[0]) {		// making sure the max heap has maximum value at the top
	                    swap(maxHeap, maxHeapSize - 1, 0);
	                }
	            }
	            else {
	                minHeap[minHeapSize++] = A[i];
	                if (minHeap[minHeapSize - 1] < minHeap[0]) {		// making sure the min heap has minimum value at the top
	                    swap(minHeap, minHeapSize - 1, 0);
	                }
	            }
	
	            // if the difference is more than one
	            if (Math.abs(maxHeapSize - minHeapSize) > 1) {
	                if (maxHeapSize > minHeapSize) {
	                    swap(maxHeap, maxHeapSize - 1, 0);
	                    minHeap[minHeapSize++] = maxHeap[--maxHeapSize];
	                    swap(minHeap, 0, minHeapSize - 1);
	                    buildMaxHeap(maxHeap, maxHeapSize);
	                }
	                else {
	                    swap(minHeap, minHeapSize - 1, 0);
	                    maxHeap[maxHeapSize++] = minHeap[--minHeapSize];
	                    swap(maxHeap, 0, maxHeapSize - 1);
	                    buildMinHeap(minHeap, minHeapSize);
	                }
	            }
	
	            // calculate the median
	            if (maxHeapSize == minHeapSize) {
	                currentMedian = (minHeap[0] + maxHeap[0]);
	                currentMedian = currentMedian / 2;
	            }
	            else if (maxHeapSize > minHeapSize) {
	                currentMedian = maxHeap[0];
	            }
	            else {
	                currentMedian = minHeap[0];
	            }
	            System.out.println(currentMedian);
	        }
    	}
    	finally {
    		sc.close();
    	}
    }

    private static void buildMaxHeap(int[] input, int heapSize) {
        int depth = (heapSize - 1) / 2;
        for (int i = depth; i >= 0; i--) {
            maxHeapify(input, i, heapSize);
        }
    }

    private static void maxHeapify(int[] input, int i, int heapSize) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // find the largest
        int largest = i;

        if (left < heapSize && input[left] > input[largest]) {
            largest = left;
        }

        if (right < heapSize && input[right] > input[largest]) {
            largest = right;
        }

        if (largest != i) {
            //swap
            swap(input, i, largest);
            //recursive call
            maxHeapify(input, largest, heapSize);
        }
    }

    private static void buildMinHeap(int[] input, int heapSize) {
        int depth = (heapSize - 1) / 2;
        for (int i = depth; i >= 0; i--) {
            minHeapify(input, i, heapSize);
        }
    }

    private static void minHeapify(int[] input, int i, int heapSize) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // find the smallest
        int smallest = i;

        if (left < heapSize && input[left] < input[smallest]) {
            smallest = left;
        }

        if (right < heapSize && input[right] < input[smallest]) {
            smallest = right;
        }

        if (smallest != i) {
            //swap
            swap(input, i, smallest);
            //recursive call
            minHeapify(input, smallest, heapSize);
        }
    }

    private static void swap(int[] input, int i, int j) {
        if (i == j)
            return;
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }
    
}