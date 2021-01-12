package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 1004
	https://leetcode.com/problems/max-consecutive-ones-iii/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/

public class MaxConsecutiveOnesIII{
	public int longestOnes(int[] A, int k){
		int i = 0,j = 0;
		for(j < A.length; j++){
			if(A[j] == 0)k--;
			if(k < 0 && A[i++] == 0)k++;
		}
		return j -i;
	}
}