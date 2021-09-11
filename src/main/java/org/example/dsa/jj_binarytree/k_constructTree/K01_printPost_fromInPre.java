package org.example.dsa.jj_binarytree.k_constructTree;

/**
 * ***************************************************************************************
 * Print PostOrder traversal from given InOrder & PreOrder sequence
 * ***************************************************************************************
 */

public class K01_printPost_fromInPre {
	
	private static int IN[]  = {4, 2, 5, 1, 3, 6};
	private static int PRE[] = {1, 2, 4, 5, 3, 6};
							//  0  1  2  3  4  5
	
	private static int preIndex = 0;
	
	
	public static void main(String[] args) {
		getPostOrder(0, IN.length-1);
	}
	
	
	private static void getPostOrder(int inStart, int inEnd) {
		if (inStart > inEnd)
			return;
		
		int foundIndex = search(inStart, inEnd, PRE[preIndex++]);
		
		getPostOrder(inStart, foundIndex-1);			// to traverse left tree
		getPostOrder(foundIndex+1, inEnd);				// to traverse right tree
		
		System.out.print(IN[foundIndex] + " ");
	}
	
	
	// search the KEY in inOrder sequence
	private static int search(int inStart, int inEnd, int key) {
		int i = 0;
		for (i = inStart; i <= inEnd; i++)
			if (IN[i] == key)
				return i;
		return i;
	}
	
}

/*
 * ---------------------------
 *           1
 *         /   \
 *        2     3
 *       / \     \
 *      4   5     6
 * 
 * ---------------------------
 */
