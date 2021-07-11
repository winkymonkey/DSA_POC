package org.example.dsa.aa_array.g_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * *****************************************************************************
 * Find the minimum number of swaps required to sort an array
 * *****************************************************************************
 * Input:  {2, 8, 5, 4}
 * Output: 1						// (swap 8 with 4)
 * 
 * Input:  {10, 19, 6, 3, 5}
 * Output: 2						// (swap 10 with 3) and (swap 19 with 5)
 * 
 * Input:  {3, 5, 2, 4, 6, 8}
 * Output: 3						// (swap 4 with 5) and (swap 2 with 3) and (swap 4 with 3)
 * 
 * Input:  {17, 15, 9, 11, 7, 13}
 * Output: 5						// (swap 17 with 7) and (swap 15 with 9) and (swap 15 with 11) and (swap 15 with 13) and (swap 15 with 17)
 * 
 * *****************************************************************************
 */

public class G06_minSwapsRequiredToSortAnArray {
	/*
	 * ---------------------------
	 * ----- SIMPLE SOLUTION -----
	 * ---------------------------
	 * Theoretically Selection sort uses minimum number of swaps.
	 * Hence we can use it and keep counting the number of swaps 
	 * 
	 * 
	 * 
	 * ---------------------------
	 * ----- TRICKY SOLUTION -----
	 * ---------------------------
	 * see below
	 * 
	 */

	public static void main(String[] args) {
		int A[] = {17, 15, 9, 11, 7, 13};
		System.out.println(findMinSwap(A));
	}

	private static int findMinSwap(int A[]) {
		List<MyPair> list = new ArrayList<>();
		for (int i=0; i<A.length; i++) {
			list.add(new MyPair(A[i], i));
		}
		
		Collections.sort(list);								// Sort the list w.r.t the first element (i.e VAL) of pair
		
		int swap = 0;
		for (int i=0; i<A.length; i++) {
			if (list.get(i).pos == i) {						// If the element is already placed correct, then continue
				continue;
			}
			else {											// Swap with its respective index
				MyPair temp = list.get(list.get(i).pos);
				list.set(list.get(i).pos, list.get(i));
				list.set(i, temp);
			}

			if (i != list.get(i).pos) {						// Swap until the correct index matches
				--i;
			}
			swap++;											// Each swap makes one element move to its correct index, so increment answer
		}
		return swap;
	}
	
	
	private static class MyPair implements Comparable<MyPair> {
		public int val;
		public int pos;

		public MyPair(int val, int pos) {
			this.val = val;
			this.pos = pos;
		}

		public int compareTo(MyPair other) {
			return this.val - other.val;
		}
	}
	
}
