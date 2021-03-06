package org.example.dsa.kk_bst.b_misc;

import java.util.ArrayList;
import java.util.List;

import org.example.dsa.kk_bst.BSTutil;
import org.example.dsa.kk_bst.Node;

/**
 * ***************************************************************************************
 * Convert a normal BST to Balanced BST
 * ***************************************************************************************
 *          10
 *          /
 *         9
 *        /							    7
 *       8							  /   \
 *      /				=>           5     9
 *     7	`					      \   / \
 *    /								   6 8  10
 *   6
 *  /
 * 5
 * ***************************************************************************************
 */

public class B02_balancingBST {
	
	public static void main(String[] args) {
		Node root = BSTutil.createNewBST3();
		
		List<Node> nodeList = new ArrayList<Node>();
		storeInorderInList(root, nodeList);
		
		int n = nodeList.size();
		root = buildTree(nodeList, 0, n-1);
		System.out.println("");
	}
	
	
	// store the InOrder sequence of the BST in a list (it is always SORTED)
	private static void storeInorderInList(Node root, List<Node> nodeList) {
		if (root == null)
			return;
		
		storeInorderInList(root.left, nodeList);
		nodeList.add(root);
		storeInorderInList(root.right, nodeList);
	}
	
	
	// create a balanced BST from the Sorted List
	private static Node buildTree(List<Node> nodeList, int start, int end) {
		if (start > end)
			return null;
		
		int mid = (start + end) / 2;
		
		Node root = nodeList.get(mid);
		root.left = buildTree(nodeList, start, mid-1);
		root.right = buildTree(nodeList, mid+1, end);

		return root;
	}
	
}
