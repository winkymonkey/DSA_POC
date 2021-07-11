package org.example.dsa.bb_string.d_substr_subseq;

import java.util.HashMap;
import java.util.Map;

/**
 * *********************************************************************************
 * Find the longest substring With K unique characters
 * *********************************************************************************
 */

public class D03_longestSubstringWithKuniqueChars {
	
	public static void main(String[] args) {
		String str = "aabacbebebe";
		int k = 3;
		int ans = findLongestSubstring(str, k);
		System.out.println(ans);
	}
	
	
	private static int findLongestSubstring(String str, int k) {
		Map<Character, Integer> map = new HashMap<>();
		int i=0, j=0;
		int ans = -1;
		
		while (j < str.length()) {
			char charKey = str.charAt(j);
			if (map.containsKey(charKey))
				map.put(charKey, map.get(charKey)+1);
			else
				map.put(charKey, 1);
			
			
			if (map.size() < k) {						// map.size() = unique char count
				j++;
			}
			else if (map.size() == k) {
				ans = Math.max(ans, j-i+1);
				j++;
			}
			else if (map.size() > k) {
				while (map.size() > k) {
					map.put( str.charAt(i), map.get(str.charAt(i))-1 );
					if ( map.get(str.charAt(i)) == 0 ) {
						map.remove(str.charAt(i));
					}
					i++;
				}
				j++;
			}
		}
		return ans;
	}
	
}
