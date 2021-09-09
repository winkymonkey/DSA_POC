package org.example.dsa.aa_array.n_binarysearch;

import java.util.Arrays;

/**
 * ***************************************************************************************
 * Allocate Minimum Number Of Pages
 * ***************************************************************************************
 * An array is given which denotes the number of pages in "n" different books.
 * These books has to be distributes among "k" students in such a way that the maximum number of pages assigned to a student is minimum.
 * You need to find the maximum number of pages that can be assigned to any students, however keeping it as minimum as possible.
 * 
 * NOTE:
 *    (1) The books are arranged in ascending order of number of pages.
 *    (2) Pages from a book cannot be divided across students.
 *    (3) Every student must be allocated at least one book.
 * 	  (4) Every student must be assigned to read consecutive books.
 * 
 * ***************************************************************************************
 * Input:	pages[] = {10, 20, 30, 40}		students = 2
 * Output:	60
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
 * ***************************************************************************************
 */

public class N01_BookAllocationProblem {
	/*
	 * --------------------
	 * Our objective is to find the maximum number of pages that can be assigned to any students, however keeping it as minimum as possible.
	 * But if we increase the number of books beyond a certain limit, some students will not get any book.
	 * 
	 * Now let us observe something,
	 * 	- the minimum number of books that can be allocated to a student ---- book having maximum pages
	 *  - the maximum number of books that can be allocated to a student ---- all books (e.g. when there is only 1 student, we have to allocate him all books)
	 * 
	 * Hence the optimal value of the allocated books must lie between 0 to ALL. And this is what we need figure out.
	 * 
	 * So we are doing nothing but searching 'x' in the above range.
	 * So let us apply Binary Search.
	 * 
	 * 
	 * TIME --- O(log N)
	 * SPACE -- O(1)
	 * 
	 * --------------------
	 */
	
	public static void main(String[] args) {
		int A[] = { 12, 34, 67, 90 };
		int k = 2;
		System.out.println(findMaxPagesCanBeAllocated(A, k));
	}
	
	
	private static int findMaxPagesCanBeAllocated(int A[], int students) {
		if (A.length < students)
			return -1;

		int start = Arrays.stream(A).max().getAsInt();
		int end = Arrays.stream(A).sum();
		int result = -1;

		while (start <= end) {
			int mid = start + (end-start)/2;
			
			if (isValid(A, students, mid)) {
				result = mid;
				end = mid-1;				// optimal value lies in the range of 0 to mid-1
			}
			else {
				start = mid+1;				// optimal value lies in the range of mid+1 to end
			}
		}
		return result;
	}
	
	
	private static boolean isValid(int A[], int students, int maxPagesStudentCanRead) {
		int count = 1;						// count of required students
		int sum = 0;

		for (int i=0; i<A.length; i++) {
			if (A[i] > maxPagesStudentCanRead)
				return false;
			
			sum = sum + A[i];
			if (sum > maxPagesStudentCanRead) {
				count++;
				sum = A[i];
			}
			if (count > students)
				return false;
		}
		return true;
	}
	
}
