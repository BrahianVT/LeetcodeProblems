
package leetcode.solutions;
import java.util.*;
/*
	Problem : 22
	Number leecode problem: 118
	https://leetcode.com/problems/number-of-matching-subsequences/
    Time Complexity: O(n*map) 
    Space Complexity: O(n*map)
*/

public class NumberMatchingSubsequences{
	private class Node{
		char[] word; int index;
		Node(String word, int index){
			this.word = word.toCharArray();
			this.index = index;
		}
	}
	
	public int numMatchingSubseq(String s, String[] words) {
        Queue<Node>[] map = new LinkedList[26];
		for(int i = 0; i < 26; i++) map[i] = new LinkedList();
		
		for(String w: words)map[w.charAt(0) - 'a'].add(new Node(w, 0));
		
		int res = 0, n = words.length;
		for(char c : s.toCharArray()){
			Queue<Node> q = map[c - 'a'];
			for(int j = q.size(); j > 0; j--){
				Node node = q.poll();
				if(++node.index == node.word.length){
					if(++res == n)return res;
				} else
					map[node.word[node.index] - 'a'].add(node);
			}
		}
		return res;
    }
}