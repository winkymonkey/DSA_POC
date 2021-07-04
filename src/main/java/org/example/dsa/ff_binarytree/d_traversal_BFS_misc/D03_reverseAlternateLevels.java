package org.example.dsa.ff_binarytree.d_traversal_BFS_misc;

import org.example.dsa.ff_binarytree.Node;
import org.example.dsa.ff_binarytree.TreeUtilA;

/**
 * *****************************************************************************
 * Reverse alternate levels of a perfect binary tree
 * *****************************************************************************
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
 * *****************************************************************************
 */

public class D03_reverseAlternateLevels {
	
	public static void main(String[] args) {
		Node root = TreeUtilA.createNewTreeA4();
		
		reverse(root.left, root.right, 0);
		System.out.println("");
	}
	
	
	private static void reverse(Node node1, Node node2, int level) {
		if (node1 == null || node2 == null)
			return;
		
		if (level%2 == 0) {
			int temp = node1.data;
			node1.data = node2.data;
			node2.data = temp;
		}
		
		reverse(node1.left, node2.right, level+1);
		reverse(node1.right, node2.left, level+1);
	}
	
}
