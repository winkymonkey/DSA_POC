package org.example.dsa.bb_string.d_substr_subseq;

import java.util.HashMap;
import java.util.Map;

/**
 * ***************************************************************************************
 * Find the longest substring With All unique characters
 * ***************************************************************************************
 */

public class D04_longestSubstringWithAllUniqueChars {
	
	public static void main(String[] args) {
		String str = "aabacbebebe";
		
		int ans = findLongestSubstring(str);
		System.out.println(ans);
	}
	
	
	private static int findLongestSubstring(String str) {
		Map<Character, Integer> map = new HashMap<>();
		int i=0, j=0;
		int ans = -1;
		
		while (j < str.length()) {
			char charKey = str.charAt(j);
			if (map.containsKey(charKey))
				map.put(charKey, map.get(charKey)+1);
			else
				map.put(charKey, 1 );
			
			
			if (map.size() < j-i+1) {				// map.size() a.k.a unique char count < window size (=j-i+1), it means some duplicates exist in the window. So remove those.
				while (map.size() < j-i+1) {
					map.put( str.charAt(i), map.get(str.charAt(i))-1 );
					if ( map.get(str.charAt(i)) == 0 ) {
						map.remove(str.charAt(i));
					}
					i++;
				}
				j++;
			}
			else if (map.size() == j-i+1) {			// map.size() a.k.a unique char count == window size (=j-i+1), so evaluate current window(=j-i+1) against "ans" & store the maximum
				ans = Math.max(ans, j-i+1);
				j++;
			}
			else if (map.size() > j-i+1) {			// map.size() a.k.a unique char count > window size (=j-i+1), it will never happen
				j++;
			}
		}
		return ans;
	}
	
}
