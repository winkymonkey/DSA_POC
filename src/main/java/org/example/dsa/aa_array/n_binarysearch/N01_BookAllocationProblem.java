package org.example.dsa.aa_array.n_binarysearch;

import java.util.Arrays;

/**
 * *****************************************************************************
 * Allocate Minimum Number Of Pages
 * *****************************************************************************
 * Given number of pages in n different books and m students.
 * The books are arranged in ascending order of number of pages.
 * Every student must be allocated at least one book.
 * Every student is assigned to read some consecutive books.
 * The task is to assign books in such a way that the maximum number of pages assigned to a student is minimum. 
 * *****************************************************************************
 * Input:	pages[] = {10, 20, 30, 40}		k = 2
 * Output:	113
 * 
 * Explanation:
 * Books can be distributed between 2 students in following fashion:
 * 		- S1 = [10]
 * 		  S2 = [20+30+40] = [90]
 * 		  Max allocated pages to someone is 90 
 * 		
 * 		- S1 = [10+20] = [30]
 * 		  S2 = [30+40] = [70]
 * 		  Max allocated pages to someone is 70
 * 
 * 		- S1 = [10+20+30] = [60]
 * 		  S2 = [40] = [40]
 * 		  Max allocated pages to someone is 60
 * 
 * Out of the 3 cases, Option 3 has the minimum pages = 60
 *  
 * *****************************************************************************
 */

public class N01_BookAllocationProblem {
	/*
	 * Theoretically, we can allocate 0 books to student1 and ALL books to student2.
	 * As each student has to be allocated atleast with one book ---> hence we cannot allocate 0 books to student1
	 * As our objective is to minimize the allocated books to anyone ---> hence we cannot allocate ALL books to student2
	 * 
	 * So, the optimal value of the allocated books must lie between 0 to ALL.
	 * And this is what we need figure out.
	 * 
	 * As per above example, 60 will be the optimal value. 
	 * But how to find that value in the range of 0 to ALL??????
	 * Binary Search is a very good option.
	 * 
	 * Note: 
	 * 	- ALL books means 10+20+30+40 = 100 pages
	 *  - Start value of search range need not to be 0. 
	 *    If we need to allocate at least one book, we should give him the book having max pages (e.g. 40)
	 *    Because if we allocate any value less than 40, then the result will never be optimal
	 * 
	 */
	
	public static void main(String[] args) {
		int arr[] = { 12, 34, 67, 90 };
		int k = 2;
		System.out.println(find(arr, k));
	}
	
	
	private static int find(int A[], int k) {		//sorted array
		if (A.length < k)
			return -1;

		int start = 0;
		int end = Arrays.stream(A).sum();
		int result = -1;

		while (start <= end) {
			int mid = start + (end-start)/2;
			
			if (isValid(A, k, mid)) {
				result = mid;
				end = mid-1;
			}
			else {
				start = mid+1;
			}
		}
		return result;
	}
	
	
	private static boolean isValid(int A[], int k, int maxPages) {
		int student = 1;
		int sum = 0;

		for (int i=0; i<A.length; i++) {
			if (A[i] > maxPages)
				return false;
			
			sum = sum + A[i];
			if (sum > maxPages) {
				student++;
				sum = A[i];
			}
			if (student > k)
				return false;
		}
		return true;
	}
	
}
