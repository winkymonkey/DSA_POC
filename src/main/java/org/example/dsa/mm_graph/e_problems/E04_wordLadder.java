package org.example.dsa.mm_graph.e_problems;

import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * ***************************************************************************************
 * Word Ladder (Length of shortest chain to reach a target word)
 * ***************************************************************************************
 * 
 */

public class E04_wordLadder {
	
	public static void main(String[] args) {
		Set<String> dictionary = new HashSet<>();
		dictionary.add("poon");
		dictionary.add("plee");
		dictionary.add("same");
		dictionary.add("poie");
		dictionary.add("plie");
		dictionary.add("poin");
		dictionary.add("plea");
		
		String start = "toon";
		String target = "plea";
		System.out.print("\nLength of shortest chain is: " + shortestChainLen(start, target, dictionary));
	}
	
	
	private static int shortestChainLen(String start, String target, Set<String> dictionary) {
		if (start == target)
			return 0;
		
		if (!dictionary.contains(target))
			return 0;

		int chainLength = 0;

		Queue<String> queue = new LinkedBlockingQueue<>();
		queue.add(start);

		while (!queue.isEmpty()) {
			++chainLength;
			char[] polled = queue.poll().toCharArray();

			for (int pos = 0; pos < polled.length; ++pos) {			// for every characters of the word
				char backupChar = polled[pos];						// take backup the character in current position so that it can be restored later

				for (char ch = 'a'; ch <= 'z'; ++ch) {				// trial-error by replacing the current character with all possible alphabets
					polled[pos] = ch;

					if (String.valueOf(polled).equals(target)) {
						System.out.print(String.valueOf(polled)+"->");
						return chainLength+1;
					}
					else if (dictionary.contains(String.valueOf(polled))) {
						System.out.print(String.valueOf(polled)+"->");
						dictionary.remove(String.valueOf(polled));
						queue.add(String.valueOf(polled));
					}
				}
				polled[pos] = backupChar;							// restore the original character at the current position
			}
		}
		return 0;
	}

}
