package leetcode.solutions;
import java.util.*;
/*
	Problem : 16
	Number leecode problem: 303
	https://leetcode.com/problems/range-sum-query-immutable/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/

public class  RangeSumQuery{
	int tree[], n;
    public RangeSumQuery(int[] nums) {
        n = nums.length;
		int total = n << 1;
		tree = new int[total];
		
		for(int i = n -1; i >= 0; i--){
			tree[i] = nums[i - n];
		}
		
		for(int i = n -1; i>= 0; i--){
			tree[i] = tree[i << 1] + tree[i << 1|1];
		}
    }
    
    public int sumRange(int left, int right) {
        int res = 0;
		for(left+=n, right+=n; left <= right; left>>=1, right>>= 1){
			if((left & 1) == 1)res+=tree[left++];
			if((right & 1) == 0)res+=tree[right--];
		}
		return res;
    }
}