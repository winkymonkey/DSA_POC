package org.example.dsa.cc_slidingWindow;

public class A00_generalFormat {

}

/*
 * --------------------
 * These problems generally contain -------------- array / string
 * These problems generally talks about ---------- subArray / subString
 * These problems generally asks to find out ----- largest / smallest / max / min
 * 
 * 
 * In FIXED WINDOW problems
 * 		Window size will be given.
 * 		A condition will be given.
 * 		We have to maximize/minimize the condition
 * 
 * In VARIABLE WINDOW problems
 * 		A condition will be given.
 * 		Based on the condition we have to maximize/minimize the window
 * 
 * 
 * ------------------------------
 * General Format (FIXED WINDOW):
 * ------------------------------
 * while (j < size) {
 *    //INDEPENDENT CALCULATION
 *    
 *    if (windowSize < K) {
 *       j++
 *    }
 *    else if (windowSize == K) {
 *       //ANSWER CALCULATION
 *       //REVERT CALCULATIONS FOR i
 *       i++
 *       j++
 *    }
 * }
 * 
 * 
 * ---------------------------------
 * General Format (VARIABLE WINDOW):
 * ---------------------------------
 * while (j < size) {
 *    //INDEPENDENT CALCULATION
 *    
 *    if (condition < K) {
 *       j++
 *    }
 *    else if (condition == K) {
 *       //ANSWER CALCULATION
 *       j++
 *    }
 *    else if (condition > K) {
 *       while (condition > K) {
 *          //REVERT CALCULATIONS FOR i
 *          j++
 *       }
 *    }
 * }
 * 
 */
