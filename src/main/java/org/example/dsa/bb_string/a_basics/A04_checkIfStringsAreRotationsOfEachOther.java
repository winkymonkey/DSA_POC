package org.example.dsa.bb_string.a_basics;

/**
 * ******************************************************************************
 * Check if strings are rotations of each other or not
 * ******************************************************************************
 * Input:	ABCD	CDAB
 * Output:	TRUE
 * 
 * Input:	ABCD	ACBD
 * Output:	FALSE
 * 
 * ******************************************************************************
 */

public class A04_checkIfStringsAreRotationsOfEachOther {
	
	public static void main(String[] args) {
		String str1 = "ABCD";
		String str2 = "CDAB";
		boolean isRotation = isRotation(str1, str2);
		System.out.println(isRotation);
	}
	
	private static boolean isRotation(String str1, String str2) {
		String mergeStr = str1 + str2;
		
		if (str1.length()==str2.length() && (mergeStr.indexOf(str2) != -1))
			return true;
		else
			return false;
	}
	
}
