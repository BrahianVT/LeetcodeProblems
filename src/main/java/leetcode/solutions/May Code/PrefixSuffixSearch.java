
package leetcode.solutions;
import java.util.*;
/*
	1
	Number leecode problem: 745
	https://leetcode.com/problems/prefix-and-suffix-search/
    
*/    


public class PrefixSuffixSearch{
	Trie root;
	public class Trie{
		int weight;
		Trie[] children = new Trie[27];
		Trie(int weight){
			this.weight = weight;
		}
	}
	
	private Trie addWord(Trie root, String word, int s, int weight){
		if(start == word.length())return root;
		if(root == null)root = new Trie(weight);
		root.weight = weight;
		
		int i = word.charAt(s) - 'a';
		root.children[i] = addWord(root.children[i], word, s + 1, weight);
		return root;
	}

	private int startsWith(String prefix, int start, Trie root){
		if(root == null)return -1;
		if(start == prefix.length())return root.weight;
		
		int id = prefix.charAt(start) - 'a';
		int res = startsWith(prefix, start + 1, root.children[id]);
		return res;
	}
    public void WordFilter(String[] words) {
        for(int i = 0; i < words.length; i++){
			String s = words[i];
			for(int j = 0; j <= s.length(); j++){
				String c = s.substring(j, s.length()) + '{' + s;
				root = addWord(root, word, 0, i);
			}
		}
    }
    
    public int f(String prefix, String suffix) {
        return startsWith(suffix + '{' + prefix, 0, root);
    }	
}
