package org.example.dsa.jj_binarytree.h_constructTree;

import org.example.dsa.jj_binarytree.Node;

/**
 * ***************************************************************************************
 * Construct Binary Tree from given InOrder & LevelOrder sequence
 * ***************************************************************************************
 */

public class H03_constructTree_fromInLevel {
	
	private static int IN[]    = {4, 8, 10, 12, 14, 20, 22};
	private static int LEVEL[] = {20, 8, 22, 4, 12, 10, 14};
	
	
	public static void main(String[] args) {
		Node root = constructTree(null, 0, IN.length-1);
		System.out.println(root);
	}
	
	
	private static Node constructTree(Node root, int inStart, int inEnd) {
		if (inStart > inEnd)
			return null;
		
		if (inStart == inEnd)
			return new Node(IN[inStart]);

		boolean found = false;
		int index = 0;

		// it finds the index in IN[] that appear first in LEVEL[]
		for (int i=0; i<LEVEL.length-1; i++) {
			for (int j=inStart; j<inEnd; j++) {
				if (LEVEL[i] == IN[j]) {
					root = new Node(LEVEL[i]);
					index = j;
					found = true;
					break;
				}
			}
			if (found)
				break;
		}
		
		root.left = constructTree(root, inStart, index-1);
		root.right = constructTree(root, index+1, inEnd);

		return root;
	}
	
}
