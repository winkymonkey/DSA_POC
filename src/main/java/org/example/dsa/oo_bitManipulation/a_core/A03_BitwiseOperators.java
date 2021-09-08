package org.example.dsa.oo_bitManipulation.a_core;


public class A03_BitwiseOperators {
	/*
	 * '&' - BITWISE AND -- when both bits are 1, o/p is 1
	 * '|' - BITWISE OR --- when any of the bits are 1, o/p is 1
	 * 
	 * '^' - BITWISE XOR -- same bits--o/p is 0
	 * 						different bits--o/p is 1
	 * 
	 * '<<' - LEFT SHIFT -- shift every bits at left, add one 0 at right		(MULTIPLY BY 2)
	 * '>>' - RIGHT SHIFT - shift every bits at right, add one 0 at left		(DIVIDE BY 2)
	 * 
	 * '~' - BITWISE NOT -- takes one number and inverts all bits of it
	 * 
	 */
	public static void main(String[] args) {
		long a = 5;	//00000101
		long b = 9;	//00001001
		
		System.out.println(a & b);
		//a = 00000101
		//b = 00001001
		//o/p=00000001=1
		
		System.out.println(a | b);
		//a = 00000101
		//b = 00001001
		//o/p=00001101=13
		
		System.out.println(a ^ b);
		//a = 00000101
		//b = 00001001
		//o/p=00001100=12
		
		System.out.println(a << 1);
		//a = 00000101	(left-shift 1)
		//o/p=00001010=10
		System.out.println(a << 2);
		//a = 00000101	(left-shift 2)
		//o/p=00010100=20
		
		System.out.println(~a);
		//a = 00000101
		//o/p=11111010=250(unsigned)
		//o/p=11111010=-6(signed)
		
	}
}
