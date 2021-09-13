package org.example.dsa.jj_binarytree.c_BFS_core;

import org.example.dsa.jj_binarytree.Node;
import org.example.dsa.jj_binarytree.TreeUtilA;

/**
 * ***************************************************************************************
 * Find level of a given node in a Binary Tree
 * ***************************************************************************************
 * 
 * 		  1
 *      /   \
 *     2     3
 *    / \   / \
 *   4   5 6   7
 *    \       /
 *     8     9
 * 
 * Level of 6 ---- 3
 * Level of 8 ---- 4
 * Level of 10 --- 0
 * ***************************************************************************************
 */

public class C05_findLevelOfNode {
	
	public static void main(String[] args) {
		Node root = TreeUtilA.createNewTreeA2();
		
		System.out.println(getLevel(root, 6, 1));
		System.out.println(getLevel(root, 8, 1));
		System.out.println(getLevel(root, 10, 1));
	}
	
	
	private static int getLevel(Node node, int num, int level) {
		if (node == null)
			return 0;
		
		if (node.data == num)
			return level;
		
		int levelViaLeft = getLevel(node.left, num, level+1);
		int levelViaRight = getLevel(node.right, num, level+1);
		
		if (levelViaLeft != 0) {			// node found in left subtree
			return levelViaLeft;
		}
		else if (levelViaRight != 0) {		// node found in right subtree
			return levelViaRight;
		}
		else {								// node is not found neither in left subtree nor in right subtree
			return 0;
		}
	}
	
}
