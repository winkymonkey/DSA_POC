package org.example.dsa.hh_binarytree.j_checking;

import org.example.dsa.hh_binarytree.Node;

/**
 * ***************************************************************************************
 * Check if the given Binary Tree is Balanced or not
 * ***************************************************************************************
 * Input:
 *     1 
 *    / \
 *  10   39
 *  / 
 * 5
 * Output: YES
 * 
 * Input:
 *     1
 *    /
 *  10
 *  /
 * 5
 * 
 * Output: NO
 * 
 * ***************************************************************************************
 */

public class J11_isBalanced {

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(10);
		root.right = new Node(39);
		root.left.left = new Node(5);

		System.out.println(isBalanced(root, 0).isBalanced);
	}
	
	
	private static Result isBalanced(Node root, int depth) {
	    if (root == null) {
	        return new Result(true, -1);
	    }

	    Result leftRes = isBalanced(root.left, depth+1);
	    Result rightRes = isBalanced(root.right, depth+1);

	    boolean isBalanced = Math.abs(leftRes.height - rightRes.height) <= 1;
	    
	    boolean isOverallBalanced = isBalanced && leftRes.isBalanced && rightRes.isBalanced;
	    int height = Math.max(leftRes.height, rightRes.height) + 1;

	    return new Result(isOverallBalanced, height);
	}
	
	
	static class Result {
	    private boolean isBalanced;
	    private int height;

	    private Result(boolean isBalanced, int height) {
	        this.isBalanced = isBalanced;
	        this.height = height;
	    }
	}
	
}
