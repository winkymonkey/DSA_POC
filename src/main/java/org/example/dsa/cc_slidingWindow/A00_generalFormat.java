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
 * In FIXED WINDOW problems ------ Window size will be given. Now depending upon some condition they will ask max/min
 * In VARIABLE WINDOW problems --- A condition will be given. Now depending upon some condition they will ask the window size
 * 
 * 
 * --------------------
 * General Format:
 * --------------------
 * while (j < size) {
 *    //initial calculations
 *    
 *    if (windowSize < K) {
 *       j++
 *    }
 *    else if (windowSize == K) {
 *       //do calculations to find answer
 *       i++
 *       j++
 *    }
 * }
 * 
 * 
 */
