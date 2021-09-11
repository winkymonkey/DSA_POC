package org.example.dsa.ff_backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * ***************************************************************************************
 * Combination Sum - can be picked multiple times
 * ***************************************************************************************
 * An array of distinct integers (candidates) and a target integer (target) is given.
 * You should return a list of all unique combinations of "candidates" where their sum equals to "target".
 * The same candidate may be chosen an unlimited number of times.
 * ***************************************************************************************
 * Input:  candidates = [2,3,6,7], 		target = 7
 * Output: [[2,2,3],[7]]
 * 
 * Input:  candidates = [2,3,5], 		target = 8
 * Output: [[2,2,2,2],[2,3,3],[3,5]]
 * 
 * ***************************************************************************************
 */

public class A01_combinationSum_repeat {
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
	 *                     /         \                ---> when we pick A[i], "i" is not incremented as we can still choose A[i] once again. However target is updated as target-A[i] 
	 *                  f(0,5)      f(1,7)            ---> when we don't pick A[i], "i" is incremented. However the target remains same
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
		
		findCombinations(A, 0, 7, new ArrayList<>());
		System.out.println(ans);
	}
	
	
	private static List<List<Integer>> ans = new ArrayList<List<Integer>>();
	
	private static void findCombinations(int A[], int i, int target, List<Integer> ds) {
		if (i == A.length) {								// we reached the end
			if (target == 0) {								// if the combination gives us the desired sum, we can simply save this valid combination in our final result
				ans.add(new ArrayList<>(ds));
			}
			return ;
		}
		
		if (A[i] <= target) {								// if A[i] is less than target, only then it makes sense to pick A[i]
			ds.add(A[i]);									// upon picking A[i], we add it in a temp data structure
			findCombinations(A, i, target-A[i], ds);		// recursively find for reduced target. But don't increment "i" as A[i] can be chosen multiple times
			ds.remove(ds.size()-1);							// after the recursive call, clear out the temp data structure
		}
		findCombinations(A, i+1, target, ds);
	}
	
}
