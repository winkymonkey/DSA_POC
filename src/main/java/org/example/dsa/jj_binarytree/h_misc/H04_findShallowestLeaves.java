package org.example.dsa.jj_binarytree.h_misc;

import org.example.dsa.jj_binarytree.Node;
import org.example.dsa.jj_binarytree.TreeUtilA;

/**
 * ***************************************************************************************
 * Print Shallowest Leaves
 * ***************************************************************************************
 * 		  1
 *      /   \
 *     2     5
 *    / \   / \
 *   3  19 6   10
 *  /       \   \
 * 12        7   9
 *          /     \
 *         8      11
 * ***************************************************************************************
 */

public class H04_findShallowestLeaves {
	
	public static void main(String[] args) {
		Node root = TreeUtilA.createNewTreeA9();
		
		findDeepestLeafLevel(root, 1);
		System.out.println(minLevel);
		
		printThisLevel(root, 1, minLevel);
	}
	
	
	
	private static int minLevel = Integer.MAX_VALUE;
	
	private static void findDeepestLeafLevel(Node node, int level) {
		if (node == null) 
			return;
		
		if (node.left==null && node.right==null && level < minLevel) {
			minLevel = level;
		}
		findDeepestLeafLevel(node.left, level+1);
		findDeepestLeafLevel(node.right, level+1);
	}
	
	
	private static void printThisLevel(Node node, int level, int targetLevel) {
		if (node == null)
			return;
		
		if ((node.left==null && node.right==null) && level == targetLevel) {
			System.out.print(node.data + " ");
		}
		else {
			printThisLevel(node.left, level+1, targetLevel);
			printThisLevel(node.right, level+1, targetLevel);
		}
	}
	
}
