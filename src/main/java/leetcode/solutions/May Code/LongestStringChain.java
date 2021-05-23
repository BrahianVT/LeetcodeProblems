package leetcode.solutions;
import java.util.*;
/*
	17
	Number leecode problem: 1048
	https://leetcode.com/problems/longest-string-chain/
	Time Complexity: O(nlogn)
	Space Complexity: O(n)
*/   



public class LongestStringChain{

	public int longestStrChain(String[] words) {
		
		Arrays.sort(words, (p1, p2) -> p1.length() - p2.length());
		Map<String, Integer> map = new HashMap<>();
		int res = 0;
		
		for(String w: words){
			int best = 0;
			for(int i = 0; i < w.length; i++){
				StringBuilder aux = new StringBuilder(w);
				aux.deleteCharAt(i);
				best = Math.max(best, map.getOrDefault(aux.toString() + 1);
			}
			map.put(w,best);
			res = Math.res(res, best);
		}
		
		return res;
	}
}