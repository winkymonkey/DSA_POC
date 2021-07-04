package org.example.dsa.ff_binarytree.g_construct;

import java.util.Stack;

/**
 * *****************************************************************************
 * Print PreOrder traversal from given InOrder and PostOrder traversals
 * *****************************************************************************
 */

public class G03_from_InorderPostorder_preorder {
	
	private static int IN[] = {7, 2, 1, 4, 3, 5};
	private static int POST[] = {7, 2, 4, 5, 3, 1};
	private static Stack<Integer> st = new Stack<>();
	
	
	public static void main(String[] args) {
		int inStart = 0;
		int inEnd = IN.length-1;
		int postEnd = POST.length-1;
		getPreOrder(inStart, inEnd, postEnd);
		
		while (!st.isEmpty())
			System.out.print(st.pop() + " ");
	}
	
	
	private static void getPreOrder(int inStart, int inEnd, int postEnd) {
		if (inStart > inEnd)
			return;
		
		if (inStart == inEnd) {
			st.push(IN[inStart]);
			return;
		}
		
		int result = search(inStart, inEnd, POST[postEnd]);
		
		getPreOrder(result+1, inEnd, postEnd-1);
		getPreOrder(inStart, result-1, result-1);
		
		st.push(IN[result]);
	}
	
	
	private static int search(int inStart, int inEnd, int key) {
		for (int k = inEnd; k >= inStart; k--)
			if (key == IN[k])
				return k;
		return 0;
	}
	
}
