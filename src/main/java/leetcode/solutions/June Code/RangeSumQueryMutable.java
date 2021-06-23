
package leetcode.solutions;
import java.util.*;
/*
	Problem : 18
	Number leecode problem: 307
	https://leetcode.com/problems/range-sum-query-mutable/
    Time Complexity: O(n) 
    Space Complexity: O(n)
*/


public class RangeSumQueryMutable{
	int n;
	int[] tree, nums;
	public RangeSumQueryMutable(int[] nums) {
		n = nums.length;
		this.nums = nums;
		tree = new int[n << 1];
		for(int i = n; i < tree.length; i++){
			tree[i] = nums[i-n];
		}
		
		for(int i = n-1; i >= 0; i--){
			tree[i] = tree[i<<1] + tree[i<<1|1];
		}
    }
    
    public void update(int index, int val) {
        for(tree[index+=n] = val; index > 0; index>>=1){
			tree[index>>1] = tree[index] + tree[index^ 1];
		}
    }
    
    public int sumRange(int left, int right) {
        int res = 0;
		for(left+=n, right+=n; left <= right; left>>=1, right>>=1){
			if((left & 1) == 1)res+=tree[left++];
			if((right & 1) == 0)res+=tree[right--];
		}
		return res;
    }
}