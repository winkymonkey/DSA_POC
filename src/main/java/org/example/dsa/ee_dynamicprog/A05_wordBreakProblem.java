package org.example.dsa.ee_dynamicprog;

/**
 * ***************************************************************************************
 * Word wrap problem
 * ***************************************************************************************
 * An array NUM[] is given which contains the length of some random words.
 * Let "WIDTH" be the limit on the number of characters that can be put in one line.
 * Your job is to put line breaks in the given sequence such that the lines are printed as neatly as possible.
 * 
 * Assume that the length of each word is smaller than the line width.
 * When line breaks are inserted, there is a possibility that extra spaces are present in each line.
 * The extra spaces include spaces put at the end of every line "except the last one"
 * 
 * In order to print lines as neatly as possible, you have to minimize the cost where
 * COST = Sum of cost of each line
 * 		= (num of spaces in line1)^3 + (num of spaces in line2)^3 + (num of spaces in line3)^3 + ......
 *  
 * ***************************************************************************************
 * Input:  NUMS = {3, 2, 2, 5}		WIDTH=6
 * Output: 10
 * 
 * K=6, so each line can have max 6 chars
 * 
 * Possibility:1
 * 		line-1--- word1 ============= total 3chars --------------------------> 3 spaces at end
 * 		line-2--- word2 + word3 ===== total 5chars (2char+1space+2char)------> 1 spaces at end
 * 		line-3--- word4 ============= total 5chars --------------------------> 1 spaces at end	//ignore the spaces at the end of last line.
 * 		COST = 3^3 + 1^3 = 28
 * 
 * Possibility:2
 * 		line-1--- word1 + word2 ===== total 6chars (3char+1space+2char)------> 0 spaces at end 
 * 		line-2--- word3 ============= total 2chars --------------------------> 4 spaces at end
 * 		line-3--- word4 ============= total 5chars --------------------------> 1 spaces at end	//ignore the spaces at the end of last line.
 * 		COST = 0^3 + 4^3 = 64
 * 
 * No other possibilities are there.
 * So minimum COST is 10
 * ***************************************************************************************
 */

public class A05_wordBreakProblem {

}
