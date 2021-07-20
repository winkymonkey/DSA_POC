package org.example.dsa.zz4_trie;


public class Trie {
	class Node {
		char ch;
		boolean isWord;
		Node[] children;
		int count;

		Node(char ch) {
			this.ch = ch;
			this.children = new Node[26];
			this.isWord = false;
			this.count = 0;
		}
	}

	private Node root;
	public Trie() {
		root = new Node('\0');
	}
	
	
	
	/** Inserts a word into the trie */
	public void insert(String word) {
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.children[ch - 'a'] == null) 			// if ch = lowercase, (ch-'a') always gives a number from 0 to 25
				curr.children[ch - 'a'] = new Node(ch);
			curr = curr.children[ch - 'a']; 				// proceed forward to next character of the word
			curr.count += 1;
		}
		curr.isWord = true;
	}
	
	
	
	/** Returns if the word is in the trie */
	public boolean search(String word) {
		Node node = getNode(word);
		return (node != null && node.isWord);
	}
	
	/** Returns if the word is in the trie */
	public boolean startsWith(String prefix) {
		Node node = getNode(prefix);
		return (node != null);
	}

	private Node getNode(String word) {
		Node curr = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (curr.children[ch - 'a'] == null)
				return null;
			curr = curr.children[ch - 'a'];
		}
		return curr;
	}
	
	
	
	/** Returns the total number of words present in the trie */
	public int getWordCountsInTrie() {
		return count(root);
	}

	private int count(Node node) {
		int result = 0;
		if (node.isWord)
			result++;
		for (int i = 0; i < 26; i++) {
			if (node.children[i] != null)
				result += count(node.children[i]);
		}
		return result;
	}
	
	
	
	/** Returns the number of words in the trie which has the prefix */
	public int getWordsCountHavingPrefix(String prefix) {
		Node node = getNode(prefix);
		return (node == null ? 0 : node.count);
	}
	
}
