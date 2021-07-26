package org.example.dsa.ff_binarytree.h_constructTree;

import java.util.Stack;

/**
 * ***************************************************************************************
 * Print PreOrder traversal from given InOrder & PostOrder sequence
 * ***************************************************************************************
 */

public class H02_printPre_fromInPost {

	private static int IN[]   = {7, 2, 1, 4, 3, 5};
	private static int POST[] = {7, 2, 4, 5, 3, 1};
							 //  0  1  2  3  4  5
	
	private static Stack<Integer> st = new Stack<>();
	private static int postIndex = IN.length-1;
	
	
	public static void main(String ars[]) {
		getPreOrder(0, IN.length-1);
		while (!st.empty())
			System.out.print(st.pop() + " ");
	}
	

	private static void getPreOrder(int inStart, int inEnd) {
		if (inStart > inEnd)
			return;
		
		int foundIndex = search(inStart, inEnd, POST[postIndex--]);
		
		getPreOrder(foundIndex+1, inEnd);			// to traverse right tree
		getPreOrder(inStart, foundIndex-1);			// to traverse left tree
		
		st.push(IN[foundIndex]);
	}

	
	private static int search(int inStrt, int inEnd, int key) {
		int i = 0;
		for (i = inStrt; i < inEnd; i++)
			if (IN[i] == key)
				return i;
		return i;
	}

}
