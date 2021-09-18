package leetcode.solutions;
import java.util.*;
/*
	Problem : 9
	Number leecode problem: 415
	https://leetcode.com/problems/add-strings/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/

public class  AddStrings{
	public String addStrings(String num1, String num2) {
		StringBuilder res =  new StringBuilder();
		 int i = num1.length()-1, j = num2.length()-1;
		 int sum = 0;
		 while( i >= 0 || j >= 0){
			 if(i >= 0)sum+=num1.charAt(i--) - '0';
			 if(j >= 0)sum+=num2.charAt(j--) - '0';
			 res.insert(0, sum%10);
			 sum/=10;
		 }
		 if(sum > 0)res.insert(0, sum);
		 
		 return res.toString();
    }
}
