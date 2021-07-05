package org.example.dsa.ff_binarytree.h_constructTreeFromTraversal;

import org.example.dsa.ff_binarytree.Node;

/**
 * *****************************************************************************
 * From given InOrder & LevelOrder sequence -- Construct the tree
 * *****************************************************************************
 */

public class H06_from_InorderLevelorder_constructTree {
	
	private static int IN[] = {4, 8, 10, 12, 14, 20, 22};
	private static int LEVEL[] = {20, 8, 22, 4, 12, 10, 14};
	
	
	public static void main(String[] args) {
		int inStart = 0;
		int inEnd = IN.length-1;
		Node root = constructTree(null, inStart, inEnd);
		System.out.println(root);
	}
	
	
	private static Node constructTree(Node startNode, int inStart, int inEnd) {
		if (inStart > inEnd)
			return null;
		
		if (inStart == inEnd)
			return new Node(IN[inStart]);

		boolean found = false;
		int index = 0;

		// it represents the index in 'IN' array of elements that appear first in 'LEVEL' array
		for (int i=0; i<LEVEL.length-1; i++) {
			for (int j=inStart; j<inEnd; j++) {
				if (LEVEL[i] == IN[j]) {
					startNode = new Node(LEVEL[i]);
					index = j;
					found = true;
					break;
				}
			}
			if (found == true)
				break;
		}
		
		startNode.left = constructTree(startNode, inStart, index-1);
		startNode.right = constructTree(startNode, index+1, inEnd);

		return startNode;
	}
	
}
