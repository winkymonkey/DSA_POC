package org.example.dsa.ee_heap.d_misc;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * ****************************************************************************************
 * Rearrange characters in a string such that NO two adjacent are same
 * ****************************************************************************************
 * Input:  aaabc
 * Output: abaca
 * 
 * Input:  aaabb
 * Output: ababa
 * 
 * Input:  aa
 * Output: Not Possible
 * 
 * Input:  aaaabc
 * Output: Not Possible
 * 
 * ****************************************************************************************
 */

public class D02_rearrangeCharsSuchThatAdjacentsAreNotSame {
	
	public static void main(String args[]) {
		String str = "bbbaa";
		rearrangeString(str);
	}
	
	
	private static void rearrangeString(String str) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i=0; i<str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
			else {
				map.put(str.charAt(i), 1);
			}
		}
		
		PriorityQueue<Key> queue = new PriorityQueue<>(new KeyComparator());
		for (HashMap.Entry<Character, Integer> entry : map.entrySet()) {
			queue.add(new Key(entry.getKey(), entry.getValue()));				// {b=3, a=2}
		}
		
		String result = "";
		Key prev = new Key('#', -1);					// works as the previous visited element

		while (queue.size() != 0) {
			Key key = queue.poll();
			result = result + key.ch;					// pop top element from queue and add it to result string

			if (prev.freq > 0)							// If freq of previous character < 0, that means it is useless, no need to push it
				queue.add(prev);
			
			(key.freq)--;
			prev = key;									// make current character as the previous 'char'
		}
		
		if (str.length() != result.length())			// if length of the resultant string and original string is not same then string is not valid
			System.out.println(" Not Possible ");
		else
			System.out.println(result);
	}
	
	
	private static class Key {
		int freq;
		char ch;
		Key(char ch, int freq) {
			this.freq = freq;
			this.ch = ch;
		}
	}
	
	
	private static class KeyComparator implements Comparator<Key> {
		public int compare(Key k1, Key k2) {
			if (k1.freq < k2.freq)
				return 1;
			else if (k1.freq > k2.freq)
				return -1;
			return 0;
		}
	}

}
