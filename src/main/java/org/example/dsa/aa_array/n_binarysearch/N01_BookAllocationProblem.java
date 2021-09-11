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
		int students = 2;
		
		Arrays.sort(A);
		System.out.println(findMaxPagesCanBeAllocated(A, students));
	}
	
	
	private static int findMaxPagesCanBeAllocated(int A[], int students) {
		if (students > A.length)
			return -1;

		int low = Arrays.stream(A).max().getAsInt();	// books having max pages
		int high = Arrays.stream(A).sum();				// all books
		int result = -1;

		while (low <= high) {
			int mid = low + (high-low)/2;
			
			if (isValid(A, students, mid)) {
				result = mid;
				high = mid-1;					// even though it's a valid possibility, we should try to minimize "maxAllotablePages"
			}
			else {
				low = mid+1;					// increase "maxAllotablePages" so that no extra students are required
			}
		}
		return result;
	}
	
	
	private static boolean isValid(int A[], int students, int maxAllotablePages) {
		int count = 1;							// count of required students
		int sum = 0;

		for (int i=0; i<A.length; i++) {
			sum = sum + A[i];					// total books that are allocated to current student
			
			if (sum > maxAllotablePages) {		// if allocated pages become higher than the max can be allocated
				count++;						// we need one more student
				sum = A[i];						// allocate this book to the new student
			}
			if (count > students) {				// if required students become total available students, then this scheme fails.
				return false;
			}
		}
		return true;
	}
	
}
