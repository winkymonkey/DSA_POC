package org.example.dsa.cc_number;

/**
 * ************************************************************************
 * Factorial of a large number
 * ************************************************************************
 * Input:	100
 * Output:	933262154439441526816992388562667004907159682643816214685929638952175999-
 * 			93229915608941463976156518286253697920827223758251185210916864000000000000000000000000
 * 
 * Input:	50
 * Output:	30414093201713378043612608166064768844377641568960512000000000000
 *       	
 * ************************************************************************
 */

public class A05_computeFactorialOfLargeNumber {
	/*
	 * Factorial of 100 has 158 digits.
	 * It is not possible to store these many digits even if we use any bigger data type
	 *  
	 */
	
	public static void main(String args[]) {
		factorial(100);
	}
	
	private static void factorial(int NUM) {
		int result[] = new int[500];
		
		result[0] = 1;
		int result_size = 1;
		
		for (int x=2; x<=NUM; x++)
			result_size = multiply(x, result, result_size);			// Apply simple factorial formula --- n! = 1 * 2 * 3 * 4...*n

		System.out.println("Factorial of given number is ");
		for (int i=result_size-1; i>=0; i--)
			System.out.print(result[i]);
	}
	
	
	// This method multiplies x with the number represented by `result[]`.
	// `result_size` is size of `result[]` or number of digits in the number represented by `result[]`.
	// This method uses simple school mathematics for multiplication.
	// This method may value of `result_size` and returns the new value of `result_size`
	private static int multiply(int x, int result[], int result_size) {
		int carry = 0; 									// Initialize carry

		for (int i=0; i<result_size; i++) {				// One by one multiply n with individual digits of 'result[]'
			int product = result[i] * x + carry;
			result[i] = product % 10; 					// Store last digit of 'product' in 'result[]'
			carry = product / 10;						// Put rest in carry
		}

		// Put carry in res and increase result size
		while (carry != 0) {
			result[result_size] = carry % 10;
			carry = carry / 10;
			result_size++;
		}
		return result_size;
	}
	
}
