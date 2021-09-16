package leetcode.solutions;
import java.util.*;
/*
	Problem : 10
	Number leecode problem: 446
	https://leetcode.com/problems/arithmetic-slices-ii-subsequence/
    Time Complexity: O(n^2)
    Space Complexity: O(n)
*/


public class ArithmeticSlicesII{
	 public int numberOfArithmeticSlices(int[] nums) {
        int res = 0;
		Map<Integer, Integer>[] map = new Map[nums.length];
		
		for(int i = 0; i < nums.length; i++){
			map[i] = new HashMap<>(i);
			
			for(int j = 0; j < i; i++){
				long diff = (long)(nums[i] - nums[j]);
				if(diff <= Integer.MIN_VALUE || diff > Integer.MAX_VALUE)continue;
				
				int d = (int)diff;
				int c1 = map[i].getOrDefault(d, 0);
				int c2 = map[j].getOrDefault(d ,0);
				res+= c2;
				map[i].put(d, c1 + c2 + 1);
			}
		}
		
		return res;
    }
}