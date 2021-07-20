package org.example.dsa.nn_bitManipulation.a_core;


public class A05_1s2sComplement {
	
	public static void main(String[] args) {
		int a = 5;		//00000101
		find1sComplement(a);
		find2sComplement(a);
	}
	
	
	private static void find1sComplement(int a) {
		System.out.println(~a);
		// a = 00000101
		//o/p= 11111010 = 250(unsigned)
		//o/p= 11111010 = -6(signed)
	}
	
	
	private static void find2sComplement(int a) {
		
	}
	
}
