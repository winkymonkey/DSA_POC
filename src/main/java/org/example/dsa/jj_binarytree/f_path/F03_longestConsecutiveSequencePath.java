package org.example.dsa.jj_binarytree.f_path;

import org.example.dsa.jj_binarytree.Node;
import org.example.dsa.jj_binarytree.TreeUtilA;

/**
 * ***************************************************************************************
 * Find the Longest Consecutive Sequence Path (comprises consecutive values)
 * ***************************************************************************************
 * Input:
 * 		  1
 *      /   \
 *     2     5
 *    / \   / \
 *   3  19 6   10
 *  /       \   \
 * 12        7   9
 *          /
 *         8
 * 
 * Output: 4			// the longest consecutive sequence path is 5->6->7->8 
 * 
 * ***************************************************************************************
 */

public class F03_longestConsecutiveSequencePath {
	
	public static void main(String[] args) {
		Node root = TreeUtilA.createNewTreeA8();
		
		findConSeq(root);
		System.out.println(maxLen);
	}
	
	
	private static int maxLen = 0;
	
	
	private static int findConSeq(Node root) {
		if (root == null)
			return 0;

		int leftLen = findConSeq(root.left);
		int rightLen = findConSeq(root.right);

		if (root.left != null && root.left.data == root.data + 1) {			// a non-leaf node which forms sequence with left child
			leftLen++;
			maxLen = Math.max(leftLen, rightLen);
			return leftLen;
		}
		else if (root.right != null && root.right.data == root.data + 1) {	// a non-leaf node which forms sequence with right child
			rightLen++;
			maxLen = Math.max(leftLen, rightLen);
			return rightLen;
		}
		else {
			return 1;														// a non-leaf node which doesn't form any sequence
		}																	// neither with left subtree nor with right subtree
	}
	
}
