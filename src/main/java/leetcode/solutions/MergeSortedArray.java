
package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 88
https://leetcode.com/problems/merge-sorted-array/
    Time Complexity: O(n)
    Space Complexity: O(1)
	
*/


public class MergeSortedArray{
	
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		
		int index1 = m -1, index2 = n -1, j = m + n - 1;
		
		while(index2 >= 0){
			if(index1 < 0 || nums2[index2] >= nums1[index1])
				nums1[j--] = nums2[index2--];
			else
				nums1[j--] = nums1[index1--];
		}
	}
}