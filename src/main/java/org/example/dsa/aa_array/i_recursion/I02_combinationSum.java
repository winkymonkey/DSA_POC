package org.example.dsa.aa_array.i_recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * ***************************************************************************************
 * Combination Sum
 * ***************************************************************************************
 * Given an array of distinct integers "candidates" and a target integer "target",
 * return a list of all unique combinations of "candidates" where the chosen numbers sum to "target".
 * You may return the combinations in any order.
 * The same number may be chosen from candidates an unlimited number of times.
 * Two combinations are unique if the frequency of at least one of the chosen numbers is different.
 * All elements of candidates are distinct.
 * ***************************************************************************************
 * Input:  candidates = [2,3,6,7], 		target = 7
 * Output: [[2,2,3],[7]]
 * 
 * Input:  candidates = [2,3,5], 		target = 8
 * Output: [[2,2,2,2],[2,3,3],[3,5]]
 * 
 * ***************************************************************************************
 */

public class I02_combinationSum {
	/*
	 * --------------------
	 * When we need to prepare a combination from a set of elements, the obvious way to follow is -- PICK or NOT PICK
	 * But here the catch is one element can be chosen multiple times.
	 * Hence after picking a number, we again get the option of PICK or NOT PICK the same number.
	 * 
	 * A[] = { 2, 3, 6, 7 }
	 * //      0  1  2  3
	 * 
	 * f(i, target)
	 * 
	 *                        f(0,7)
	 *                      ____|____
	 *                     /         \                ---> when we pick some element, the index is not updated as we can still choose a few more times, but the target decreases
	 *                  f(0,5)      f(1,7)            ---> when we don't pick some element, the index is incremented, but the target remains the same
	 *                 ___|___
	 *                /       \
	 *             f(0,3)   f(1,5)
	 *            ___|___
	 *           /       \
	 *        f(0,1)   f(1,3)
	 *        __|__      |
	 *       /     \
	 *      X     f(1,1)   ......
	 *            __|__     ......
	 *           /     \     ......
	 *          X    f(2,1)   ......
	 *               __|__
	 *              /     \
	 *             X     f(3,1)
	 *                   __|__
	 *                  /     \
	 *                 X    f(4,1)
	 * 
	 * This recursion tree will grow big
	 * 
	 * 
	 * --------------------
	 */
	
	public static void main(String[] args) {
		int A[] = { 2, 3, 6, 7 };
		
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		findCombinations(A, 0, 7, new ArrayList<>(), ans);
		System.out.println();
	}
	
	
	private static void findCombinations(int A[], int i, int target, List<Integer> ds, List<List<Integer>> ans) {
		if (i == A.length) {
			if (target == 0) {
				ans.add(new ArrayList<>(ds));
			}
			return ;
		}
		
		if (A[i] <= target) {
			ds.add(A[i]);
			findCombinations(A, i, target-A[i], ds, ans);
			ds.remove(ds.size()-1);
		}
		findCombinations(A, i+1, target, ds, ans);
	}
	
}
