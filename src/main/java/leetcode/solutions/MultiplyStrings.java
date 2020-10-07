
package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 43

	https://leetcode.com/problems/multiply-strings/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/

public class MultiplyStrings{
	public String multiply(String num1, String num2){
		
		int m = num1.length(), n = num2.length();
		
		int[] res = new int[ m + n];
		
		for(int i = m-1; i >= 0; i--){
			for(int j = n-1; j >= 0; j++){
				int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
				int index = i + j + 1, prevIndex = i + j; 
				int sum = mul + res[index];
				res[index] = sum%10;
				res[prevIndex]+=sum/10;
			}
		}
		
		StringBuilder ans = new StringBuilder();
		

		for(int n : res){
			if(!(n == 0 && ans.length() == 0))ans.append(p);			
		}
		
		return res.length() == 0?"0":res.toString();
	}
}