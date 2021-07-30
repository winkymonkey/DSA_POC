package org.example.dsa.bb_string.d_longestsubstring;

import java.util.HashMap;
import java.util.Map;

/**
 * ***************************************************************************************
 * Find the longest substring With K unique characters
 * ***************************************************************************************
 */

public class D01_longestSubstringWithKuniqueChars {
	
	public static void main(String[] args) {
		String str = "aabacbebebe";
		int K = 3;
		int ans = findLongestSubstring(str, K);
		System.out.println(ans);
	}
	
	
	private static int findLongestSubstring(String str, int K) {
		Map<Character, Integer> map = new HashMap<>();
		int i=0, j=0;
		int ans = -1;
		
		while (j < str.length()) {
			char charKey = str.charAt(j);
			if (map.containsKey(charKey))
				map.put(charKey, map.get(charKey)+1);
			else
				map.put(charKey, 1);
			
			
			if (map.size() < K) {						// map.size() a.k.a unique char count < K, so we can safely add more chars in the window
				j++;
			}
			else if (map.size() == K) {					// map.size() a.k.a unique char count == K, so evaluate current window(=j-i+1) against "ans" & store the maximum
				ans = Math.max(ans, j-i+1);
				j++;
			}
			else if (map.size() > K) {					// map.size() a.k.a unique char count > K, keep removing chars from starting of the window
				while (map.size() > K) {
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
