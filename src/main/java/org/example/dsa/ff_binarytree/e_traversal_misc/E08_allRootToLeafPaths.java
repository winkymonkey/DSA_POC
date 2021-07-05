package org.example.dsa.ff_binarytree.e_traversal_misc;

import java.util.LinkedList;
import java.util.List;

import org.example.dsa.ff_binarytree.Node;

/**
 * **********************************************************************
 * Given a binary tree, print all root-to-leaf paths
 * **********************************************************************
 * Input:
 *     10
 *    /  \
 *   8    2
 *  / \   /
 * 3   5 2
 *    /
 *   7
 * 
 * Output:
 * 		10 –> 8 –> 3
 * 		10 –> 8 –> 5 -> 7
 * 		10 –> 2 –> 2
 * 
 * **********************************************************************
 */

public class E08_allRootToLeafPaths {
	/*
	 * ------------------
	 * Root node appends its name in the array and pass 2 copies of this array to both of its left & right child
	 * Now each of the children will have independent view of the array
	 * So the children also appends its name in the array and pass 2 copies of this updated array to both of its left & right child
	 * this process goes on and on....
	 * 
	 * As soon as it's a leaf node, it appends its name in the array and print the array.
	 * ------------------
	 */
	
	public static void main(String args[]) {
		Node root = new Node(10);
		root.left = new Node(8);
		root.right = new Node(2);
		
		root.left.left = new Node(3);
		root.left.right = new Node(5);
		
		root.right.left = new Node(2);
		
		root.left.right.left = new Node(7);

		List<Integer> list = new LinkedList<>();
		findPaths(root, list);
	}
	
	
	private static void findPaths(Node root, List<Integer> list) {
		if (root == null)
			return;

		List<Integer> newList = new LinkedList<>(list);
		newList.add(root.data);

		if (root.left == null && root.right == null) {
			newList.forEach(elem -> System.out.print(elem+" -> "));
			System.out.println();
		}
		else {
			findPaths(root.left, newList);
			findPaths(root.right, newList);
		}
	}
	
}
