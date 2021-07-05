package org.example.dsa.ff_binarytree.j_constructTreeFromRepresentation;

/**
 * *****************************************************************************
 * Construct Binary Tree from given Parent Array representation
 * *****************************************************************************
 * Given an array that represents a tree in such a way that
 * array indexes are values in tree nodes and array values give the parent node of that particular index (or node).
 * The value of the root node index would always be -1 as there is no parent for root.
 * 
 * *****************************************************************************
 * Input:	parent[] = {1, 5, 5, 2, 2, -1, 3}
 * 			//index     0  1  2  3  4   5  6
 * 
 * Output:
 *        5
 *      /   \
 *     1     2
 *    /     / \
 *   0     3   4
 *        /
 *       6 
 * 
 * Explanation:
 * Index of -1 is 5.				==> So 5 is root.  
 * 5 is present at indexes 1 and 2. ==> So 1 and 2 are children of 5.  
 * 1 is present at index 0.			==> So 0 is child of 1.
 * 2 is present at indexes 3 and 4.	==> So 3 and 4 are children of 2.  
 * 3 is present at index 6.			==> So 6 is child of 3.
 * 
 * *****************************************************************************
 */

public class J03_buildBinaryTree_from_parentArray {
	/*
	 * 
	 */
}
