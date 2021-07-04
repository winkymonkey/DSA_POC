package org.example.dsa.ff_binarytree.g_construct;

import org.example.dsa.ff_binarytree.Node;

/**
 * *****************************************************************************
 * Construct Tree from given InOrder and PostOrder traversals
 * *****************************************************************************
 */

public class G04_from_InorderPostorder_constructTree {
	
	private static int IN[] = {7, 2, 1, 4, 3, 5};
	private static int POST[] = {7, 2, 4, 5, 3, 1};
	
	
	public static void main(String[] args) {
		int inStart = 0;
		int inEnd = IN.length-1;
		int postEnd = POST.length-1;
		Node root = buildTree(inStart, inEnd, postEnd);
		System.out.println(root);
	}
	
	
	private static Node buildTree(int inStart, int inEnd, int postEnd) {
		if (inStart > inEnd)
			return null;
		
		Node node = new Node(POST[postEnd]);
		
		if (inStart == inEnd) {
			return node;
		}
		
		int result = search(inStart, inEnd, POST[postEnd]);
		
		node.right = buildTree(result+1, inEnd, postEnd-1);
		node.left = buildTree(inStart, result-1, result-1);			//node.left = buildTree(inStart, result-1, postEnd-1);
		
		return node;
	}
	
	
	private static int search(int inStart, int inEnd, int key) {
		for (int k = inEnd; k >= inStart; k--)
			if (key == IN[k])
				return k;
		return 0;
	}
	
}
