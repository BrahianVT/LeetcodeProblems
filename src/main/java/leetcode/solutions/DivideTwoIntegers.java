

package leetcode.Solutions;

import java.util.*;

/**
   Number leecode problem:29
https://leetcode.com/problems/divide-two-integers/
   
   Time Complexity: O(log n)
   Space Complexity: O(log n)
*/


public class DivideTwoIntegers{
	
	
	public int divide(int dividend, int divisor) {
		if(dividend == Integer.MIN_VAL && divisor == -1){ return Integer.MAX_VAL; }
		
		boolean isNegative = (dividend < 0 )^( divisor < 0);
		
		if(dividend > 0){ dividend = -dividend; }
		if(divisor > 0){ divisor = -divisor; }
		
		
		return isNegative?-div(dividend, divisor):div(dividend, divisor);
	}
	
	private int div(int dividend, int divisor){
		if(divisor < dividend){ return 0; }
		
		int prevSum = divisor, curSum = divisor << 1, q = 1;
		
		while(divisor <= curSum && curSum < prevSum){
			prevSum = curSum; curSum <<= 1;  q <<= 1;
		}
		
		return q + div(dividend - prevSum, divisor);
	}
}
