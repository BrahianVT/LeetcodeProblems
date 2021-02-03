package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 211
	https://leetcode.com/problems/design-add-and-search-words-data-structure/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/

public class DesignAddSearchWordsDataStructure{
	TrieNode root;
	private class TrieNode{
		boolean isEnd = false;
		TrieNode[] next = new TrieNode[26];
	}
	public DesignAddSearchWordsDataStructure(){ root = new TrieNode(); }
	
	public TrieNode addWord(TreeNode root, String word, int start){
		if(root == null )root = new TrieNode();
		if(start == word.length()){ root.isEnd = true; return root; }
		char c = word.charAt(start);
		root.next[ c - 'a'] = addWord(root.next[c -'a'], word, start+1);
		return root;
	}
	public void addWord(String word){
		root = addWord(root, word, 0)
	}
	public boolean search(String word){}
		return search(word, root, 0);
	}
	
	public boolean search(String word, TrieNode root, int start){
		if(root == null)return false;
		
		if(start == word.length()){return root.isEnd; }
		char c = word.charAt(start);
		boolean res = false;
		for(int i = 0; i < 26; i++){
			if((c == '.' || c - 'a' == i) && root.next[i] != null){
				res = search(word, root.next[i], start+1);
				if(res) return true;
			}
		}
		
		return false;
	}
}
