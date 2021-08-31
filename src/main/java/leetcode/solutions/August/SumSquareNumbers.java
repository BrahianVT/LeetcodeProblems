package leetcode.solutions;
import java.util.*;
/*
	Problem : 25
	Number leecode problem: 633
	https://leetcode.com/problems/sum-of-square-numbers/
    Time Complexity: O(sqrt(c/2))
    Space Complexity: O(1)
*/


public class SumSquareNumbers{
	public boolen judgeSquareSum(int c){
		int end = (int)Math.sqrt(c/2);
		
		for(int i = 0; i <= end; i++){
			int s = (int)Math.sqrt(c - i*i);
			if(i*i + s*s  == c)return true;
		}
		
		return false;
	}
}