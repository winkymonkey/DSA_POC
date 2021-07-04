package org.example.dsa.ff_binarytree.g_construct;

/**
 * *****************************************************************************
 * From given PreOrder & PostOrder sequence -- Construct the tree
 * *****************************************************************************
 */

public class G07_from_PreorderPostorder_constructFullBinaryTree {
	/*             1
	 *           /   \
	 *         2       3
	 *       /  \     /  \
	 *      4    5   6    7
	 *    /  \  
	 *   8    9
	 *  
	 * 
	 * It is not possible to construct a general Binary Tree from PreOrder and PostOrder traversals
	 * But if know that the Binary Tree is Full, we can construct the tree without ambiguity.
	 * 
	 * ------------------
	 * STEP-1
	 * ------------------
	 * PRE[] =  {1, 2, 4, 8, 9, 5, 3, 6, 7}
	 * POST[] = {8, 9, 4, 5, 2, 6, 7, 3, 1};
	 * 
	 * in PRE[], the leftmost element is root of tree. (so 1 is root)
	 * hence in PRE[], the next value of root must be left-child. (so 2 is left-child)
	 * so we know 1 is root and 2 is left child
	 * how to find the all nodes in left subtree?
	 * We know 2 is root of all nodes in left subtree.
	 * so, all nodes before 2 in post[] must be in left subtree.
	 * 
	 *              1
	 *           /     \
	 *          /       \
	 *   {8,9,4,5,2}  {6,7,3}
	 * so,
	 * PRE =  {2, 4, 8, 9, 5}             PRE =  {3, 6, 7}
	 * POST = {8, 9, 4, 5, 2}             POST = {6, 7, 3}
	 * 
	 * 
	 * ------------------
	 * STEP-2
	 * ------------------
	 * in PRE[], the leftmost element is root of tree. (so 2 is root)
	 * hence in PRE[], the next value of root must be left-child. (so 4 is left-child)
	 * so we know 2 is root and 4 is left child
	 * how to find the all nodes in left subtree?
	 * We know 4 is root of all nodes in left subtree.
	 * so, all nodes before 4 in post[] must be in left subtree.
	 * 
	 *               1
	 *            /     \
	 *           2       3
	 *         /  \     / \
	 *   {8,4,9}   5   6   7
	 * 
	 * 
	 * continue further as above
	 * 
	 */
}
