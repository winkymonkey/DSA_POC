package org.example.dsa.ff_binarytree.e_otherTraversal;

import org.example.dsa.ff_binarytree.Node;
import org.example.dsa.ff_binarytree.TreeUtilA;

/**
 * ***************************************************************************************
 * Print a Binary Tree in Vertical Order
 * ***************************************************************************************
 * Input:
 *          1
 *        /   \
 *       2     3
 *      / \   / \
 *     4   5 6   7
 *            \   \
 *             8   9 
 * 
 * Output:
 * 		4
 * 		2
 * 		1 5 6
 * 		3 8
 * 		7
 * 		9
 * 
 * TIME --- O(n^2)
 * SPACE -- O(1)
 * 
 * ***************************************************************************************
 */

public class E02A_printVerticalOrder_withoutExtraSpace {
	
	private static int MIN = 0;			//min horizontal distance from root
	private static int MAX = 0;			//max horizontal distance from root
	
	
	public static void main(String args[]) {
		Node root = TreeUtilA.createNewTreeA7();
		findMinMaxDistance(root, 0);
		
		for (int line=MIN; line<=MAX; line++) {
			printVerticalLine(root, 0, line);
			System.out.println("");
		}
	}
	
	
	private static void findMinMaxDistance(Node node, int hd) { 			// hd = horizontal distance of current node from root
		if (node == null)
			return;
		
		MIN = (hd < MIN ? hd : MIN);
		MAX = (hd > MAX ? hd : MAX);
		
		findMinMaxDistance(node.left, hd-1);
		findMinMaxDistance(node.right, hd+1);
	}
	
	
	private static void printVerticalLine(Node node, int hd, int line) {	// hd = horizontal distance of current node from root
		if (node == null)
			return;
		
		if (hd == line)
			System.out.print(node.data + " ");
		
		printVerticalLine(node.left, hd-1, line);
		printVerticalLine(node.right, hd+1, line);
	}
	
}
