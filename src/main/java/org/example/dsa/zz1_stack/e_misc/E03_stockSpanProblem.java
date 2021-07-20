package org.example.dsa.zz1_stack.e_misc;

import java.util.Arrays;
import java.util.Stack;

/**
 * *****************************************************************************
 * The Stock Span Problem
 * *****************************************************************************
 * It is a financial problem where we have a series of n daily price quotes for a stock. 
 * We need to calculate span of stock’s price for all n days.
 * 
 * The span Si of the stock’s price on a given day i is defined as:
 * the maximum number of consecutive days just before the given day, for which the stock price on the current day is <= its price on the given day.
 * 
 * *****************************************************************************
 * If an array of 7 days prices is given as {100, 80, 60, 70, 60, 75, 85}
 * then the span values for corresponding 7 days are {1, 1, 1, 2, 1, 4, 6}
 * 
 * For day-1: 	stock price is 100		number of days prior to it where price was lesser or equal is 1 (day1:100)
 * For day-2: 	stock price is 80		number of days prior to it where price was lesser or equal is 1 (day2:80)
 * For day-3: 	stock price is 60		number of days prior to it where price was lesser or equal is 1 (day3:60)
 * For day-4: 	stock price is 70		number of days prior to it where price was lesser or equal is 2 (day3:60, day4:70)
 * For day-5: 	stock price is 60		number of days prior to it where price was lesser or equal is 1 (day5:60)
 * For day-6: 	stock price is 75		number of days prior to it where price was lesser or equal is 4 (day3:60, day4:70, day5:60, day6:75)
 * For day-7: 	stock price is 85		number of days prior to it where price was lesser or equal is 1 (day2"80, day3:60, day4:70, day5:60, day6:75)
 * 
 * *****************************************************************************
 */

public class E03_stockSpanProblem {
	/*
	 * Maintain the sequence of indexes in Stack where "Prices" are in decreasing order.
	 * Stack will store indexes of most recent decreasing sequence
	 * 
	 * 
	 * TIME --- O(n)
	 * We can observe that every element of array is added to & removed from stack at most once each.
	 * So there are total 2n operations at most.
	 * 
	 * SPACE -- O(n)
	 * 
	 */
	
	public static void main(String[] args) {
		int PRICE[] = {100, 80, 60, 70, 60, 75, 85};
		int n = PRICE.length;
		int SPAN[] = new int[n];

		calculateSpan(PRICE, n, SPAN);

		System.out.println(Arrays.toString(SPAN));
	}
	
	
	private static void calculateSpan(int PRICE[], int n, int SPAN[]) {
		SPAN[0] = 1;							// span value of first element is always 1
		
		Stack<Integer> stack = new Stack<>();
		stack.push(0);

		for (int i = 1; i < n; i++) {
			while (!stack.empty() && PRICE[stack.peek()] <= PRICE[i])		//when left side element is smaller in PRICE[]
				stack.pop();

			SPAN[i] = (stack.empty()) ? (i + 1) : (i - stack.peek());

			stack.push(i);
		}
	}
}
