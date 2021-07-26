package org.example.dsa.ff_binarytree.d_BFS_misc;

import org.example.dsa.ff_binarytree.Node;
import org.example.dsa.ff_binarytree.TreeUtilA;

/**
 * ***************************************************************************************
 * Reverse alternate levels of a perfect Binary Tree
 * ***************************************************************************************
 * Input:
 *            1
 *        /       \
 *      2           3
 *    /   \       /   \
 *   4     5     6     7
 *  / \   / \   / \   / \
 * 8   9 10 11 12 13 14 15
 * 
 * 
 * Output:
 *            1
 *        /       \
 *      3           2
 *    /   \       /   \
 *   4     5     6     7
 *  / \   / \   / \   / \
 * 15 14 13 12 11 10 9   8
 * 
 * ***************************************************************************************
 */

public class D03_reverseAlternateLevels {
	
	public static void main(String[] args) {
		Node root = TreeUtilA.createNewTreeA4();
		
		reverse(root.left, root.right, 0);
		System.out.println("");
	}
	
	
	private static void reverse(Node leftRoot, Node rightRoot, int level) {
		if (leftRoot == null || rightRoot == null)
			return;
		
		if (level%2 == 0) {
			int temp = leftRoot.data;
			leftRoot.data = rightRoot.data;
			rightRoot.data = temp;
		}
		
		reverse(leftRoot.left, rightRoot.right, level+1);
		reverse(leftRoot.right, rightRoot.left, level+1);
	}
	
}
