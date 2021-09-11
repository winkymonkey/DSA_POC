package org.example.dsa.dd_greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ***************************************************************************************
 * N meetings In One Room
 * ***************************************************************************************
 * There is one meeting room.
 * There are N meetings in the form of (S[i], F[i]) where S[i] and F[i] denotes the start time and finish time of meeting i.
 * The task is to find the MAXIMUM number of meetings that can be accommodated in the meeting room.
 * 
 * NOTE:
 * 	Start time of one meeting cannot be equal to the end time of another meeting
 * 
 * ***************************************************************************************
 * Input:
 * S[] = { 1, 0, 3, 8, 5, 8 }
 * F[] = { 2, 6, 4, 9, 7, 9 }
 * 		// 1  2  3  4  5  6
 * 
 * Output:
 * 1 3 5 4		//1st, 3rd, 5th, 4th meeting
 * 
 * ***************************************************************************************
 */

public class A01_multipleMeetingsInOneRoom {
	/*
	 * --------------------
	 * We need to perform as many as we can
	 * This is only possible if we perform the meeting first whose finishing time is early
	 * So let us sort the meetings (ascending order) in the order of their finishing time
	 * If finishing time conflicts, choose as per their order of appearance
	 * --------------------
	 */
	
	public static void main(String[] args) {
		int S[] = { 1, 0, 3, 8, 5, 8 };
		int F[] = { 2, 6, 4, 9, 7, 9 };
		//			1  2  3  4  5  6
		
		List<Meeting> list = new ArrayList<>();
		for(int i=0; i<S.length; i++) {
			list.add(new Meeting(S[i], F[i], i+1));					// as the meeting index is 1 based so (i+1)
		}
		
		findMaxMeetings(list);
	}
	
	
	private static void findMaxMeetings(List<Meeting> list) {
		Collections.sort(list, (m1,m2)-> m1.end-m2.end);
		
		int endTime = -1;
		
		for (Meeting meet : list) {
			if (meet.start > endTime) {
				System.out.println(meet.pos);
				endTime = meet.end;
			}
		}
	}
	
	
	static class Meeting {
		public int start;
		public int end;
		public int pos;
		
		Meeting (int start, int end, int pos) {
			this.start = start;
			this.end = end;
			this.pos = pos;
		}
	}
	
}
