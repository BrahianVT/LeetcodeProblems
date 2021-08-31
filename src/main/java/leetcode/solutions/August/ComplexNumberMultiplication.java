

package leetcode.solutions;
import java.util.*;
/*
	Problem : 24
	Number leecode problem: 537
	https://leetcode.com/problems/complex-number-multiplication/
    Time Complexity: O(1)
    Space Complexity: O(1)
*/

public class ComplexNumberMultiplication{
		
	public String complexNumberMultiply(String num1, String num2) {
		int[] one = new int[2] , two = int[2];
		
		int i = num1.indedxOf("+"), j = nums2.indexOf("+");
		
		one[0] = Integer.parseInt(num1.substring(0, i));
		two[0] = Integer.parseInt(num2.substring(0, j));
		
		one[1] = integer.parseInt(num1.substring(i+1, num1.length() -1));
		two[1] = integer.parseInt(num2.substring(i+1, num2.length() -1));
		
		int real = 0, img = 0;
		real += one[0] * two[0];
		img+= one[0] * two[1];
		img+= one[1] * two[0];
		real+= one[1] * two[1](-1);
		
		return real + "+" + img + "i";
	}	
}