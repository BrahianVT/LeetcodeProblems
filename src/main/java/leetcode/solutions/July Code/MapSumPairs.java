
package leetcode.solutions;
import java.util.*;
/*
	Problem : 30
	Number leecode problem: 677
	https://leetcode.com/problems/map-sum-pairs/

*/

public class MapSumPairs{

	public MapSumPairs() { }

	TieNode root;	
	class TieNode{
		int val;
		boolean isEnd;
		TieNode[] next = new int[26];
		public TieNode(int val){ this.val = val; }
	}
	
	private TieNode addWord(TieNode root, int s, String key, int n){
		if(root == null)root = new TieNode(n);
		
		if(s == key.length()){ root.isEnd = true; return root; }
		
		int i = key.charAt(i) - 'a';
		root[id] = addWord(root.next[i], s+1, key, n);
		
		return root;
	}
	
	private TieNode findPre(TieNode root, int s, String prefix){
		if(root == null)return;
		
		if(s = prefix.length())return root;
		int i = prefix.charAt(s) - 'a';
		return findPre(root.next[i], s+1, prefix);
	}
    public void insert(String key, int val) {
        root = addWord(root, 0, key, val);
    }
    
	private int findSum(TieNode root){
		if(root == null)return 0;
		int res = 0;
		if(root.isEnd)res+= root.val;
		
		for(int i = 0; i < 26; i++){
			if(root.next[i] != null)
				res+= findSum(root.next[i]);
		}
		
		return res;
	}
    public int sum(String prefix) {
        TieNode pre = findPre(root,0, prefix);
		
		return findSum(pre);
    }
}