
package leetcode.solutions;
import java.util.*;
/*
	Problem : 26
	Number leecode problem: 315
	https://leetcode.com/problems/count-of-smaller-numbers-after-self/
    Time Complexity: O(nlog n) 
    Space Complexity: O(n)
*/

public class  CountSmallerNumbersAfterSelf{
	public List<Integer> countSmaller(int[] nums) {
		int[] index  = new int[nums.length], res = new int[nums.length];
		for(int i = 0; i < nums.length; i++)index[i] = i;
		mergeSort(nums, index, res, 0, nums.length-1);
		List<Integer> ans = new ArrayList();
		for(int n: res)ans.add(n);
		
		return ans;
	}
	
	private void mergeSort(int[] nums, int[] index, int[] res, int s, int e){
		if(s >= e) return;
		int m = (e + s) / 2;
		mergerSort(nums, index, res, s, m);
		mergerSort(nums, index, res, m+1, e);
		mergeEle(nums, index, res, s, m, m+1, e);
	}
	
	private void mergeEle(int[] nums, int[] index, int[] res, int l1, int r1, int, l2, int r2){
		
		int[] aux = new int[r2-l1 + 1];
		int p = 0, count = 0, start = l1;
		while(l1 <= r1 || l2 <= r2){
			if(l1 > r1)
				aux[p++] = index[l2++];
			else if (l2 > r2){
				res[index[l1]]+= count;
				aux[p++] = index[l1++];
			}
			else if(nums[index[l1]] > nums[index[l2]]){
				aux[p++] = index[l2++];
				count++;
			} 
			else {
				 res[index[l1]]+= count;
				 aux[p++] = index[l1++];
			}
		}
	
		while(int i = 0; i < aux.length; i++)
			index[start + i] = aux[i];
	}
}
