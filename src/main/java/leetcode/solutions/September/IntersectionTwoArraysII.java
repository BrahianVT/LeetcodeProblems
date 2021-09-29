
package leetcode.solutions;
import java.util.*;
/*
	Problem : 17
	Number leecode problem: 350
	https://leetcode.com/problems/intersection-of-two-arrays-ii/
    Time Complexity: O(log n)
    Space Complexity: o(n)
*/


public class IntersectionTwoArraysII{
	
	public int[] intersect(int[] nums1, int[] nums2) {
		List<Integer> res = new ArrayList();
		Arrays.sort(nums1); Arrays.sort(nums2);
		
		for(int i = 0, j = 0; i < nums1.length && j < nums2.length){
			if(nums1[i] < nums2[j])i++;
			else if (nums1[i] == nums2[j]){
				res.add(nums1[i]); i++; j++;
			} else {
				j++;
			}
		}
		
		return res.stream().mapToInt(k -> k).toArray();
    }
}