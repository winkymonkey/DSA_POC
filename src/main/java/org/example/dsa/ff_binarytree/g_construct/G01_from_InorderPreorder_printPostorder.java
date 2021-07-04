package org.example.dsa.ff_binarytree.g_construct;

/**
 * *****************************************************************************
 * From given InOrder & PreOrder sequence -- Print PostOrder traversal
 * *****************************************************************************
 */

public class G01_from_InorderPreorder_printPostorder {
	
	private static int IN[] = {7, 2, 1, 4, 3, 5};
	private static int PRE[] = {1, 2, 7, 3, 4, 5};
	
	
	public static void main(String[] args) {
		int inStart = 0;
		int inEnd = IN.length-1;
		int preStart = 0;
		getPostOrder(inStart, inEnd, preStart);
	}
	
	
	private static void getPostOrder(int inStart, int inEnd, int preStart) {
		if (inStart > inEnd)
			return;
		
		if (inStart == inEnd) {
			System.out.print(IN[inStart] + " ");
			return;
		}
		
		int result = search(inStart, inEnd, PRE[preStart]);
		
		getPostOrder(inStart, result-1, preStart+1);
		getPostOrder(result+1, inEnd, result+1);
		
		System.out.print(IN[result] + " ");
	}
	
	
	private static int search(int inStart, int inEnd, int key) {
		for (int k = inStart; k <= inEnd; k++)
			if (key == IN[k])
				return k;
		return 0;
	}
	
}
