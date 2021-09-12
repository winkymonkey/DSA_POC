package org.example.dsa.zz4_trie;


public class TrieNode {
	public TrieNode[] children;				// 26 children
	public boolean isWord;					// whether it's the end of word
	public int count;						// keep track of how many times this node is visited 

	public TrieNode() {
		this.children = new TrieNode[26];
		this.isWord = false;
		this.count = 0;
	}
	
}
