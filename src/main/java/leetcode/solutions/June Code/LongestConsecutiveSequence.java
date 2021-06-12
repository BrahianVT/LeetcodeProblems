package leetcode.solutions;
import java.util.*;
/*
	Problem : 6
	Number leecode problem: 128
	https://leetcode.com/problems/longest-consecutive-sequence/
    Time Complexity: O(n) 
    Space Complexity: O(n)
*/



public class LongestConsecutiveSequence{

	public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
		for(int n: nums)set.add(n);
		int res = 0;
		for(int n :nums){
			if(!set.contains(n-1)){
				int m = n + 1;
				while(set.contains(m))m++;
				res = Math.max(res, m - n);
			}
		}
		
		return res;
    }
}