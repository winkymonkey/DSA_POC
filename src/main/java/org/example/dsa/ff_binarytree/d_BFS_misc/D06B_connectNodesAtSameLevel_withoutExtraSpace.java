package org.example.dsa.ff_binarytree.d_BFS_misc;

import org.example.dsa.ff_binarytree.Node;

/**
 * ***************************************************************************************
 * Connect nodes at same level
 * ***************************************************************************************
 * Input:
 *          1
 *       /     \
 *      2       3
 *     / \     / \
 *    4   5   6   7
 *   / \         / \
 *  8   9      10   11
 * 
 * 
 * Output:
 *          1  -->NULL
 *       /     \
 *      2  -->  3 -->NULL
 *     / \     / \
 *    4-->5-->6-->7-->NULL
 *   / \         / \
 *  8-->9  --> 10-->11-->NULL
 * 
 * ***************************************************************************************
 */

public class D06B_connectNodesAtSameLevel_withoutExtraSpace {

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		root.left.left.left = new Node(8);
		root.left.left.right = new Node(9);
		
		root.right.right.left = new Node(10);
		root.right.right.right = new Node(11);

		connect(root);
		System.out.println("");
	}
	
	
	private static void connect(Node root) {
		if (root == null)
			return;

		if (root.next != null)
			connect(root.next);

		if (root.left != null) {						// if ROOT has a left child
			if (root.right != null) {
				root.left.next = root.right;
				root.right.next = getNextRight(root);
			}
			else {
				root.left.next = getNextRight(root);
			}
			connect(root.left);
		}
		else if (root.right != null) {					// if ROOT has a right child, but no left child
			root.right.next = getNextRight(root);
			connect(root.right);
		}
		else {											// if ROOT has no child
			connect(getNextRight(root));
		}
	}
	
	
	private static Node getNextRight(Node node) {
		Node temp = node.next;

		while (temp != null) {							// keep on going TEMP's next until TEMP has atleast 1 child
			if (temp.left != null)
				return temp.left;
			
			if (temp.right != null)
				return temp.right;
			
			temp = temp.next;
		}
		return null;
	}
	
}
