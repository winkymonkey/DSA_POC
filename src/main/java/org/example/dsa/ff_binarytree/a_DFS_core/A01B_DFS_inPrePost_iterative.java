package org.example.dsa.ff_binarytree.a_DFS_core;

import java.util.Stack;

import org.example.dsa.ff_binarytree.Node;
import org.example.dsa.ff_binarytree.TreeUtilA;

/**
 * ***************************************************************************************
 * Print InOrder, PreOrder, PostOrder traversal sequence using iterative approach
 * ***************************************************************************************
 * 		  1
 *      /   \
 *     2     3
 *    / \   / \
 *   4   5 6   7
 *    \       /
 *     8     9
 * 
 * InOrder:   4 8 2 5 1 6 3 9 7
 * PreOrder:  1 2 4 8 5 3 6 7 9
 * PostOrder: 8 4 5 2 6 9 7 3 1
 * 
 * ***************************************************************************************
 */

public class A01B_DFS_inPrePost_iterative {

	public static void main(String[] args) {
		Node root = TreeUtilA.createNewTreeA2();
		
		System.out.print("InOrder:::");
		inorder(root);
		
		System.out.print("\nPreOrder::");
		preOrder(root);
		
		System.out.print("\nPostOrder:");
		postOrder(root);
	}
	
	
	private static void inorder(Node root) {
		Stack<Node> stack = new Stack<>();
		stack.push(root);
		
		Node current = root;

		while (!stack.isEmpty()) {
			while (current.left != null) {
				stack.push(current.left);
				current = current.left;
			}
			Node popped = stack.pop();
			System.out.print(popped.data + " ");
			if (popped.right != null) {
				stack.push(popped.right);
				current = popped.right;
			}
		}
	}
	
	
	public static void preOrder(Node root) {
		Stack<Node> stack = new Stack<>();
		stack.push(root);

		while (!stack.isEmpty()) {
			Node popped = stack.pop();
			System.out.print(popped.data + " ");
			
			if (popped.right != null)
				stack.push(popped.right);
			
			if (popped.left != null)
				stack.push(popped.left);
		}
	}
	
	
	public static void postOrder(Node root) {
		Stack<Node> stack = new Stack<>();
		stack.push(root);
		
		Stack<Node> output = new Stack<>();

		while (!stack.isEmpty()) {
			Node popped = stack.pop();
			output.push(popped);
			
			if (popped.left != null)
				stack.push(popped.left);
			
			if (popped.right != null)
				stack.push(popped.right);
		}
		
		while (!output.isEmpty()) {
			System.out.print(output.pop().data + " ");
		}
	}
	
}
