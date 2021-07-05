package org.example.dsa.ff_binarytree.h_constructTreeFromTraversal;

import org.example.dsa.ff_binarytree.Node;

/**
 * *****************************************************************************
 * From given InOrder & PreOrder sequence -- Construct the tree
 * *****************************************************************************
 */

public class H02_from_InorderPreorder_constructTree {
	
	private static int IN[] = {7, 2, 1, 4, 3, 5};
	private static int PRE[] = {1, 2, 7, 3, 4, 5};
	
	
	public static void main(String args[]) {
		int inStart = 0;
		int inEnd = IN.length-1;
		int preStart = 0;
		Node root = buildTree(inStart, inEnd, preStart);
		System.out.println(root);
	}
	

	private static Node buildTree(int inStart, int inEnd, int preStart) {
		if (inStart > inEnd)
			return null;
		
		Node node = new Node(PRE[preStart]);

		if (inStart == inEnd)
			return node;

		int result = search(inStart, inEnd, PRE[preStart]);
		
		node.left = buildTree(inStart, result-1, preStart+1);
		node.right = buildTree(result+1, inEnd, result+1);

		return node;
	}
	
	
	private static int search(int inStart, int inEnd, int key) {
		for (int k = inStart; k <= inEnd; k++)
			if (key == IN[k])
				return k;
		return 0;
	}

}
