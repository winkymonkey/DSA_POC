package org.example.dsa.jj_binarytree.e_otherTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.example.dsa.jj_binarytree.Node;
import org.example.dsa.jj_binarytree.TreeUtilA;

/**
 * ***************************************************************************************
 * Print a Binary Tree in Vertical Order
 * ***************************************************************************************
 * Input:
 *          1
 *        /   \
 *       2     3
 *      / \   / \
 *     4   5 6   7
 *            \   \
 *             8   9 
 * 
 * Output:
 * 		4
 * 		2
 * 		1 5 6
 * 		3 8
 * 		7
 * 		9
 * 
 * TIME --- O(n)
 * SPACE -- O(n)
 * 
 * ***************************************************************************************
 */

public class E02B_printVerticalOrder_withExtraSpace {
	
	private static Map<Integer, List<Integer>> map = new TreeMap<>();		// map: {KEY=hd, VALUE=list of elements at that distance}
	
	
	public static void main(String args[]) {
		Node root = TreeUtilA.createNewTreeA7();
		getVerticalOrder(root, 0);
		
		map.values().forEach(val -> System.out.println(val));
	}
	
	
	private static void getVerticalOrder(Node root, int hd) {
		if (root == null)
			return;

		if (map.get(hd) != null) {
			map.get(hd).add(root.data);
		}
		else {
			List<Integer> list = new ArrayList<>();
			list.add(root.data);
			map.put(hd, list);
		}
		
		getVerticalOrder(root.left, hd-1);
		getVerticalOrder(root.right, hd+1);
	}
	
}
