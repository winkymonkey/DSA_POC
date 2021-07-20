package org.example.dsa.zz1_stack.e_misc;

/**
 * *****************************************************************************
 * The Celebrity Problem
 * *****************************************************************************
 * In a party of N people, only one person is known to everyone.
 * Such a person may be present in the party, if yes, (s)he doesn’t know anyone in the party.
 * We can only ask questions like "does A know B?"
 * Find the stranger (celebrity) in the minimum number of questions.
 * 
 * We can describe the problem input as an array of numbers/characters representing persons in the party.
 * We also have a hypothetical function HaveAcquaintance(A, B) which returns true if A knows B, false otherwise.
 * 
 * *****************************************************************************
 */

public class E04_celebrityProblem {
	/*
	 * --------------------
	 * ---NAIVE APPROACH---
	 * --------------------
	 * Ask "HaveAcquaintance()" question to each of the person about all other person.
	 * As Example,
	 *  - ask A, if he knows B
	 *  - ask A, if he knows C
	 *  - ask A, if he knows D
	 *  - ....
	 *  - ask A, if he knows Z
	 *  
	 *  - ask B, if he knows A
	 *  - ask B, if he knows C
	 *  - ...
	 *  - ask B, if he knows Z
	 * ...it goes on for O(n^2) times.
	 * 
	 * 
	 * 
	 * 
	 * ------------------------
	 * ---EFFICIENT APPROACH---
	 * ------------------------
	 * https://webcourse.cs.technion.ac.il/234247/Spring2006/ho/WCFiles/Celebrity.pdf
	 * 
	 * Our algorithm consists of two phases:
	 * 	1. Elimination Phase --- in this phase, we eliminate all but one person from being the celebrity
	 * 	2. Verification Phase -- in this phase, we check whether this one remaining person is indeed a celebrity.
	 * 
	 * We have following observation
	 * 	- If A knows B, then A can't be celebrity. Discard A, and B may be celebrity.
	 * 	- If A doesn't know B, then B can't be celebrity. Discard B, and A may be celebrity.
	 * 
	 * 
	 * ---ELIMINATION PHASE---
	 * The elimination phase maintains a list of possible celebrities
	 * Initially it contains all n people
	 * Let's put them all in a Stack.
	 * In each iteration, pop first two elements from Stack & ask them the universal question
	 *   - here one person is identified who can't be a celebrity
	 *   - and another person is identified who can be a celebrity ("Potential Celebrity")
	 * Push the "Potential Celebrity" into the stack again
	 * Repeat until only one person (k) remains in the stack
	 * 
	 * 
	 * ---VERIFICATION PHASE---
	 * We now verify by brute force whether 'k' is a celebrity.
	 * For every other person i,
	 * 	 - we ask person 'k' whether he knows person i,
	 * 	 - and we ask person i whether they know person 'k'
	 * If person 'k' always answers no, and the other people always answer yes, then declare 'k' as the celebrity.
	 * Otherwise, we conclude there is no celebrity in this group.
	 * 
	 * 
	 * ---COMPLEXITY---
	 * The elimination phase requires exactly (n-1) questions, since each question reduces the size on the list by 1.
	 * In the verification phase, we ask (n-1) questions to person k and and 1 question to the remaining (n-1) people. It requires at most 2(n-1) questions
	 * 
	 */
}
