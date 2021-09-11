package org.example.dsa.dd_greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ***************************************************************************************
 * Minimum number of platforms required for a railway station
 * ***************************************************************************************
 * Input:
 * arr[] = {9:00,  9:40, 9:50,  11:00, 15:00, 18:00}
 * dep[] = {9:10, 12:00, 11:20, 11:30, 19:00, 20:00}
 * 
 * Output:
 * 3
 * ***************************************************************************************
 */

public class A02_minimumPlatformRequired {
	/*
	 * --------------------
	 * Consider all events in sorted order.
	 * Then trace the number of trains at any time, by keeping a count of trains that have arrived, but not departed.
	 * 
	 * Time		EventType		platformCount
	 * 9:00		Arrival				1
	 * 9:10		Departure			0
	 * 9:40		Arrival				1
	 * 9:50		Arrival				2
	 * 11:00	Arrival				3
	 * 11:20	Departure			2
	 * 11:30	Departure			1
	 * 12:00	Departure			0
	 * 15:00	Arrival				1
	 * 18:00	Arrival				2
	 * 19:00	Departure			1
	 * 20:00	Departure			0
	 * --------------------
	 */
	
	public static void main(String[] args) {
		int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
		int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
		
		List<Event> list = new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			list.add(new Event(arr[i], "ARRIVAL"));
			list.add(new Event(dep[i], "DEPARTURE"));
		}
		
		countMinimumPlatform(list);
	}
	
	
	private static void countMinimumPlatform(List<Event> list) {
		Collections.sort(list, (e1,e2)-> e1.time-e2.time);
		
		int maxPlatform = Integer.MIN_VALUE;
		int platformCount = 0;
		
		for(Event event : list) {
			if (event.type.equals("ARRIVAL"))
				++platformCount;
			else if (event.type.equals("DEPARTURE"))
				--platformCount;
			
			maxPlatform = Math.max(maxPlatform, platformCount);
		}
		System.out.println(maxPlatform);
	}
	
	
	static class Event {
		public int time;
		public String type;
		
		public Event(int time, String type) {
			this.time = time;
			this.type = type;
		}
	}
	
}
