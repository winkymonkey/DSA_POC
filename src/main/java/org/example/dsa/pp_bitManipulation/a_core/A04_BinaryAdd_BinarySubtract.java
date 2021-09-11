package org.example.dsa.pp_bitManipulation.a_core;


public class A04_BinaryAdd_BinarySubtract {
	
	public static void main(String[] args) {
		int a = 30;		//11110
		int b = 5;		//00101
		System.out.println(addition(a, b));
		System.out.println(subtract(a, b));
	}
	
	
	private static int addition(int a, int b) {
		int carry;
		while (b != 0) {
			carry = (a & b) << 1;	//it holds the carry
			a = a ^ b;				//it does the sum without considering the carry
			b = carry;
		}
		return a;
	}
	
	
	private static int subtract(int a, int b) {
		int carry;
		b = addition(~b, 1);
		while (b != 0) {
			carry = (a & b) << 1;	//do AND, then left-shift (Basically it holds the carry)
			a = a ^ b;				//do XOR (Basically it does the sum without considering the carry)
			b = carry;
		}
		return a;
	}
	
}
