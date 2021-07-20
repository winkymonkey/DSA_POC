package org.example.dsa.nn_bitManipulation.a_core;


public class A01_DecimalToBinary {
	/*
	 * --------------------------
	 * ---ARITHMETIC OPERATION---
	 * --------------------------
	 * bin[];			--> number of bits in a decimal number = Floor(logN)+1 == hence it should be the size of array
	 * i = 0;
	 * while (n > 0) {
	 * 	  bin[i] = n%2;
	 * 	  n = n/2;
	 * 	  i++;
	 * }
	 * 
	 * //print bin[] in reverse order
	 * 
	 * 
	 * 
	 * 
	 * --------------------------------------
	 * ---ARITHMETIC OPERATION (recursive)---
	 * --------------------------------------
	 * findBinary(n) {
	 * 	  if (n > 1)
	 *       findBinary(n/2)
	 * 	  
	 * 	  //print (n%2)
	 * }
	 * 
	 * 
	 * 
	 * 
	 * -----------------------
	 * ---BITWISE OPERATION---
	 * -----------------------
	 * for (i=31 to 0) {			//in Java, integer is of 32bits
	 *    k = n >> i;
	 *    print (k & 1)
	 * }
	 * 
	 */
}
