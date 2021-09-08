package org.example.dsa.hh_binarytree.f_path;

import java.util.LinkedList;
import java.util.List;

import org.example.dsa.hh_binarytree.Node;

/**
 * ***************************************************************************************
 * Print all root-to-leaf paths
 * ***************************************************************************************
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
 * ***************************************************************************************
 */

public class F01_allRootToLeafPaths {
	/*
	 * ------------------
	 * Write a function that appends current root to the list & recursively call for both left subtree and right subtree.
	 * During each recursive call, pass on the list.
	 * Now each subtree will have independent view of the list.
	 * 
	 * Now each subtree adds the current root to the list & repeats the process.
	 * 
	 * As soon as it encounters a leaf node, it appends the leaf node in the list and print the list.
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
