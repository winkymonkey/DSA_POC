package org.example.dsa.jj_binarytree.j_checking;

/**
 * ***************************************************************************************
 * Check if all leaves are at same level in a Binary Tree
 * ***************************************************************************************
 */

public class J06_areAllLeavesAtSameLevel {
	/*
	 * ------------------
	 * int storedLevel = 0;
	 * int level = 0;
	 * 
	 * Start traversing from the root.
	 * While recursively calling for any the child node, increment the "curreentLevel" value.
	 * As soon as it reaches a leaf, store "curreentLevel" value in "leafLevel".
	 * 
	 * Start traversing from the root again.
	 * Now recursively call for both the child node and pass "level" value.
	 * Each recursive call increments "level".
	 * Whenever, any leaf node is encountered, if its "level" value doesn't match with "leafLevel" ,flip a global flag.
	 * Once the flag is flipped, never flip it further in other recursive call.
	 * ------------------
	 */
}
