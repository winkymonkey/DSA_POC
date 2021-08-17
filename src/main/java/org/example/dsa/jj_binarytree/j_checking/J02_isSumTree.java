package org.example.dsa.jj_binarytree.j_checking;

/**
 * ***************************************************************************************
 * Check if a given Binary Tree is SumTree
 * ***************************************************************************************
 * In a SumTree "the value of a node" is equal to "sum of the nodes present in its left & right subtree". 
 * An empty tree is SumTree. 
 * A leaf node is also SumTree.
 * 
 *          26
 *         /   \
 *        10    3
 *       /  \    \
 *      4    6    3
 *      
 * ***************************************************************************************
 */

public class J02_isSumTree {
	/*
	 * ----METHOD--1----
	 * Get the sum of nodes in left subtree and right subtree.
	 * Check if the sum calculated is equal to root's data.
	 * Also, recursively check if the left and right subtrees are SumTrees.
	 * 
	 * TIME--O(n^2)
	 * 
	 * 
	 * 
	 * ----METHOD--2----
	 * IF it's a Leaf Node
	 * {
	 * 	  Sum of subtree rooted with this node = value of this node;
	 * }
	 * ELSE
	 * {
	 * 	  Sum of subtree rooted with this node = 2 * (value of this node); 
	 * }
	 * 
	 */
}
