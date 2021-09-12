package org.example.dsa.zz4_trie;


public class Trie {
	
	private TrieNode root;
	
	public Trie() {
		this.root = new TrieNode();
	}
	
	
	
	
	/*
	 * Inserts a word into the trie
	 * (if ch is lowercase, (ch-'a') always gives a number from 0 to 25
	 */
	public void insert(String word) {
		TrieNode curr = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.children[ch - 'a'] == null) {			// if current character is not present
				curr.children[ch - 'a'] = new TrieNode();	// put a TrieNode in current character's slot
			}
			curr = curr.children[ch - 'a']; 				// go to the next node
			curr.count += 1;
		}
		curr.isWord = true;
	}
	
	/*
	 * Returns if this "word" exists
	 */
	public boolean search(String word) {
		TrieNode node = findNode(word);
		return (node != null && node.isWord);
	}
	
	/*
	 * Returns if there are words starting with this "prefix"
	 */
	public boolean startsWith(String prefix) {
		TrieNode node = findNode(prefix);
		return (node != null);
	}

	/*
	 * Returns the total number of words present in the trie
	 */
	public int getWordCountsInTrie() {
		return count(root);
	}
	
	/*
	 * Returns the number of words in the trie which has the prefix
	 */
	public int getWordsCountHavingPrefix(String prefix) {
		TrieNode node = findNode(prefix);
		return (node == null ? 0 : node.count);
	}
	
	
	
	
	private TrieNode findNode(String word) {
		TrieNode curr = root;
		for (int i=0; i<word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.children[ch - 'a'] == null) {
				return null;
			}
			else {
				curr = curr.children[ch - 'a'];
			}
		}
		return curr;
	}
	
	private int count(TrieNode node) {
		if (node == null)
			return 0;
		
		int result = 0;
		if (node.isWord)
			result++;
		
		for (int i=0; i<26; i++) {
			result += count(node.children[i]);
		}
		return result;
	}
	
}
