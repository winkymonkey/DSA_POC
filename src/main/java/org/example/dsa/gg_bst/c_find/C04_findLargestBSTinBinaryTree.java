package org.example.dsa.gg_bst.c_find;

import org.example.dsa.gg_bst.BSTutil;
import org.example.dsa.gg_bst.Node;

/**
 * ********************************************************************************
 * Find the largest BST in a Binary Tree
 * ********************************************************************************
 * Input:
 *              25
 *         /          \
 *      18             50
 *     /  \          /    \
 *   19    20      35     60
 *    \   /  \    /  \   /  \
 *    15 19  25  20  40 55   70
 *                \
 *                25
 * 
 * Output: 8
 * ********************************************************************************
 */

public class C04_findLargestBSTinBinaryTree {
	/*
	 * ---------------
	 * We should traverse the tree in bottom-up fashion (recursively).
	 * Every node returns 4 piece of information to its parent. 
	 * 		-- is it a BST
	 * 		-- size of the max BST till now
	 * 		-- min in current subtree
	 * 		-- max in current subtree
	 * 
	 * If both left and right subtree are BST and this node data is greater than max of left and less than min of right
	 * then it returns to above level left size + right size + 1 
	 * and new min will be min of left side and new max will be max of right side.
	 * ---------------
	 */
	
	public static void main(String[] args) {
		Node root = BSTutil.createNewBST4();
		MinMax minMax = findLargestBST(root);
		System.out.println(minMax.size);
	}
	
	
	private static MinMax findLargestBST(Node root) {
		if (root == null)
			return new MinMax();
		
		MinMax leftMinMax = findLargestBST(root.left);
		MinMax rightMinMax = findLargestBST(root.right);
		
		if (leftMinMax.isBST == false || rightMinMax.isBST == false || (leftMinMax.max > root.data || rightMinMax.min <= root.data)) {
			MinMax minMax = new MinMax();
			minMax.isBST = false;
			minMax.size = Math.max(leftMinMax.size, rightMinMax.size);
			return minMax;
		}
		
		// if we reach this point means subtree with this node as root is BST.
		MinMax minMax = new MinMax();
		minMax.isBST = true;
		minMax.size = leftMinMax.size + rightMinMax.size + 1;
		minMax.min = (root.left != null ? leftMinMax.min : root.data);
		minMax.max = (root.right != null ? rightMinMax.max : root.data);
		return minMax;
	}
	
	
	static class MinMax {
		int min;
		int max;
		boolean isBST;
		int size;

		MinMax() {
			this.min = Integer.MAX_VALUE;
			this.max = Integer.MIN_VALUE;
			this.isBST = true;
			this.size = 0;
		}
	}
	
}
