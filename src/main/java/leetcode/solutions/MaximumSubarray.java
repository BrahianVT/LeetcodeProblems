package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 53

	https://leetcode.com/problems/maximum-subarray/
    Time Complexity: O(n)
    Space Complexity: O(1)
*/
public class MaximumSubarray{
	int maxSoFar = nums[0], maxEndingHere = nums[0];
	
	for(int i = 1; i < nums.length; i++){
		maxEndingHere = Math.max(maxEndingHere + nums[i], nums[i]);
		maxSoFar = Math.max(maxSoFar, maxEndingHere);
	}
}