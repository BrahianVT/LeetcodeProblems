package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 70
	https://leetcode.com/problems/climbing-stairs/
    Time Complexity: O(n)
    Space Complexity: O(1)
*/
public class ClimbingStairs{
	public int climbStairs(int n){
		if(n == 0 || n == 1){ return 1; }
		
		int stepOne = 1, stepTwo = 1, res = 0;
		
		for(int i = 2; i <= n; i++){
			res = stepOne + stepTwo;
			stepOne = stepTwo;
			stepTwo = res;
		}
		
		return res;
	}
}
