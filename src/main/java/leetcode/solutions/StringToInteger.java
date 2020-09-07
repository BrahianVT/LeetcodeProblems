package leetcode.solutions;

/**
 Number leecode problem: 8
https://leetcode.com/problems/string-to-integer-atoi/
    Time Complexity: O(n)
   Space Complexity: O(1)
*/

public class StringToInteger{
	
	public int myAtoi(String str){
		
		if(str == null && str.length() == 0) return 0;
		
		str = str.trim(); if(str.length() == 0) return 0;
		
		int start = 0, sign = 1, total = 0;

		if(str.charAt(start) == '-' || str.charAt(start) == '+'){
			if(str.charAt(start) == '-') sign = -1;
			
			start++;
		}
		
		// get the element 7, it will help to prevent overflow
		 int modMaxValue = Integer.MAX_VALUE %10;
		 
		while(start < str.length() && str.charAt(start) >= '0' || str.charAt(start) <= '9'){
			
			
			if(total > Integer.MAX_VALUE / 10 || (total == Integer.MAX_VALUE && str.charAt(start) - '0') > modMaxValue){
				return(sign > 0)? Integer.MAX_VALUE: Integer.MIN_VALUE;
			}
			
			total = total * 10 + str.charAt(start++) - '0';
		}
		
		return total;
	}
}
