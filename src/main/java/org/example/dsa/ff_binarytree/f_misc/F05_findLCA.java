package org.example.dsa.ff_binarytree.f_misc;

import org.example.dsa.ff_binarytree.Node;
import org.example.dsa.ff_binarytree.TreeUtilA;

/**
 * ************************************************************************************************************
 * Find the LCA (lowest common ancestor) between two given nodes n1 and n2 in a Binary Tree
 * ************************************************************************************************************
 * The LCA between two nodes n1 and n2 is defined as the lowest node in the tree that has both n1 & n2 as descendants 
 * The LCA of n1 & n2 in the tree is the shared ancestor of n1 & n2 that is located farthest from the root
 * 
 * Computation of LCA may be useful as part of a procedure for determining the distance between pairs of nodes in a tree:
 * The distance from n1 to n2 can be computed as 
 * = (the distance from the root to n1) + (the distance from the root to n2) + (twice the distance from the root to their LCA)
 * 
 * ************************************************************************************************************
 * Input:
 * 		  1
 *      /   \
 *     2     3
 *    / \   / \
 *   4   5 6   7
 *  /           \
 * 8             9
 * 
 * LCA(4, 5) = 2
 * LCA(4, 6) = 1
 * LCA(3, 4) = 1
 * LCA(2, 4) = 2
 * 
 * ************************************************************************************************************
 */

public class F05_findLCA {
	/*
	 * ------------------
	 * Traverse the tree starting from the root.
	 * 
	 * - If either n1 or n2 matches with the root, then the root is LCA.
	 * - Otherwise, we recur for the left and right subtree.
	 *  	- If a node has one key present in its left subtree and the another key in the right subtree, then the node is the LCA.
	 *  	- If both keys lie in the left subtree then the left subtree has LCA also, otherwise, LCA lies in the right subtree.
	 * 
	 * TIME --- O(n)
	 * SPACE -- O(1)
	 * ------------------
	 */
	
	public static void main(String[] args) {
		Node root = TreeUtilA.createNewTreeA1();
		int n1 = 4;
		int n2 = 6;
		
		Node lca = findLCA(root, n1, n2);
		System.out.println(lca.data);
	}
	
	
	private static Node findLCA(Node root, int n1, int n2) {
		if (root == null)
			return null;
		
		if (root.data == n1 || root.data == n2)
			return root;
		
		Node left_lca = findLCA(root.left, n1, n2);
		Node right_lca = findLCA(root.right, n1, n2);
		
		if (left_lca!=null && right_lca!=null)					// one node is present in left subtree & another node is present is right subtree
			return root;
		
		return (left_lca != null) ? left_lca : right_lca;
	}
	
}
