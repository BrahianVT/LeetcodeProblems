package leetcode.solutions;
import java.util.*;
/*
	Problem : 27
	Number leecode problem: 522
	https://leetcode.com/problems/longest-uncommon-subsequence-ii/
    Time Complexity: O(n^2)
    Space Complexity: O(n)
*/


public class LongestUncommonSubsequenceII{
	public int findLUSlength(String[] strs) {
		int res = -1, n = strs.length;			
		
		for(int i = 0; i < n; i++){
			if(strs[i].length() < res)continue;
			int j=-1;
			
			while(++j < n)if(i != j && isSubs(strs[i], strs[j]))break;
			if(j == n)res = Math.max(res, strs[i].length());
		}
		return res;
    }	
	
	private boolean isSubs(String a, String b){
		int i = 0, j = 0;
		while(i < a.length() && j < b.length()){
			if(a.charAt(i) == b.charAt(j++))i++;
		}
		return i == a.length();
	}
}