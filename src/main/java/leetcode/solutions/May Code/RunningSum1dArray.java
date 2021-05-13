
package leetcode.solutions;
import java.util.*;
/*
	3
	Number leecode problem: 1480
	https://leetcode.com/problems/running-sum-of-1d-array/
    Time Complexity: O(n) 
    Space Complexity: O(n)
*/    

public class RunningSum1dArray{
	public int[] runningSum(int[] sums){
		for(int i = 1; i < sums.length; i++){
			sums[i]+=sums[i - 1];
		}
		return sums;
	}
}