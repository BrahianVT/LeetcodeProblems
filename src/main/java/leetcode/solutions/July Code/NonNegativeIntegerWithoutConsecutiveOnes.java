
package leetcode.solutions;
import java.util.*;
/*
	Problem : 25
	Number leecode problem: 600
	https://leetcode.com/problems/non-negative-integers-without-consecutive-ones/
    Time Complexity: O(2^k -1) 
    Space Complexity: O(1)
*/

public class NonNegativeIntegerWithoutConsecutiveOnes{
	
	public int findIntegers(int n){
		int[] dp = new int[32];
		dp[0] = 1; dp[1] = 2;
		
		for(int i = 2; i < 32; i++)dp[i] = dp[i-1] + dp[i-2];
		
		char[] bin = Integer.toBinaryString(n).toCharArray();
		int len = bin.length-1;
		int ans = 0;
		boolean preBit = false;
		for(int i = 0; i < bin.length; i++){
			if(bin[i] == '1'){
				ans+= dp[len - i];
				if(preBit)return ans;
				preBit = true;
			} else preBit = false;
		}
		
		return ans + 1;
	}
}