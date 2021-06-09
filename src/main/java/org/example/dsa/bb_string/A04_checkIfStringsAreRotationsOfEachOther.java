package org.example.dsa.bb_string;

/**
 * ******************************************************************************
 * Check if strings are rotations of each other or not
 * ******************************************************************************
 * Input:	s1 = ABCD	s2 = CDAB
 * Output:	TRUE
 * 
 * Input:	s1 = ABCD	s2 = ACBD
 * Output:	FALSE
 * 
 * ******************************************************************************
 */

public class A04_checkIfStringsAreRotationsOfEachOther {
	
	public static void main(String[] args) {
		String str1 = "ABCD";
		String str2 = "CDAB";
		System.out.println(isRotation(str1, str2));
	}
	
	private static boolean isRotation(String str1, String str2) {
		if ((str1.length()==str2.length()) && ((str1+str1).indexOf(str2) != -1))
			return true;
		else
			return false;
	}
	
}
