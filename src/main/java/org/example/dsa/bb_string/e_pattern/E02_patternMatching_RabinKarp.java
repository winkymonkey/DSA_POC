package org.example.dsa.bb_string.e_pattern;

/**
 * ******************************************************************************
 * Find out the occurrences of a given pattern in another string
 * TEXT length = n
 * PATTERN length = m
 * n > m
 * ******************************************************************************
 * Input:	TEXT[] = "THIS IS A TEST TEXT"		PATT[] = "TEST"
 * Output:	Pattern found at index 10
 * 
 * Input:	TEXT[] = "AABAACAADAABAABA"			PATT[] = "AABA"
 * Output:	Pattern found at index 0,9,12
 * 
 * Input:	TEXT[] = "CCACCAACDBA"				PATT[] = "DBA"
 * OUTPUT:	Pattern found at index 8
 * 
 * ******************************************************************************
 */

public class E02_patternMatching_RabinKarp {
	/*
	 * --------------------------
	 * ---RABIN-KARP Algorithm---
	 * --------------------------
	 * This algorithm also slides the pattern one by one.
	 * But unlike the naive approach, this algorithm matches the `hash value of the pattern` with the `hash value of current substring of text`.
	 * If the hash values match then only it starts matching individual characters. 
	 * 
	 * So this algorithm need to calculate the hash value of the following string:
	 *    - Pattern itself
	 *    - All the substrings of the text of length m 
	 * 
	 * If the quality of the hash function is poor, then there can be scenarios where the hash value matches, but the underlying characters don't match.
	 * 
	 * 
	 * 
	 * -----------------
	 * So how to calculate the hash value?
	 * -----------------
	 * Hash value of `DBA` is 
	 * 		4*(26^2) + 2*(26^1) + 1*(26^0)
	 * 
	 * But calculating the hash value of a given string is not enough.
	 * Rather we should be able to calculate the hash value of the "current window" from the "previous window" in the sliding window solution.
	 * This kind of hash function is known as "rolling hash function" 
	 * 
	 * 
	 * 
	 * -----------------
	 * How to define the rolling hash function?
	 * -----------------
	 * Suppose we assign a number to each alphabets like below:
	 * 		A->1   B->2   C->3   D->4   E->5   F->6   G->7	 H->8   I->9   J->10  K->11  L->12  M->13  
	 * 		N->14  O->15  P->16  Q->17  R->18  S->19  T->20  U->21  V->22  W->23  X->24  Y->25  Z->26
	 * 
	 * Hash value of the initial window of `CCA` in the string `CCACCAACDBA` will be
	 * 		H(OLD) = 3*(26^2) + 3*(26^1) + 1*(26^0)
	 * 
	 * Hash value of the next window of `CAC`  in the string `CCACCAACDBA` will be
	 * 		H(NEW) = 3*(26^2) + 1*(26^1) + 3*(26^0)
	 * 
	 * We can rewrite it as below: 
	 * 		H(NEW) = ( H(OLD) - hashOfRemovedChar ) * 26 + hashOfAddedChar
	 * 
	 * 
	 * 
	 * -----------------
	 * If the above computation gives a number which is too big to be stored in a variable?
	 * -----------------
	 * That's why we can take any prime number `Q` and take the MOD against each large hash value.
	 * So H(OLD) becomes ---> H(OLD) % Q
	 * So H(NEW) becomes ---> H(NEW) % Q
	 * 
	 * 
	 */
	
}
