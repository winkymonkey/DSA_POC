package org.example.dsa.zz4_trie;

import java.util.stream.Stream;


public class MainClass {
	
	private static String[] words = {"bat", "batman", "bathtub", "bathroom", "battle", "battlefield", "battleship", "battery", "battalion"};
	
	public static void main(String[] args) {
		Trie trie = new Trie();		
		Stream.of(words).forEach(myWord -> trie.insert(myWord));
		
		System.out.println(trie.getWordCountsInTrie());
		System.out.println(trie.getWordsCountHavingPrefix("batt"));
		
		
		System.out.println(trie.search("bat"));			//true
		System.out.println(trie.search("bath"));		//false
		
		System.out.println(trie.startsWith("bat"));		//true
		System.out.println(trie.startsWith("bath"));	//true
	}
	
}
