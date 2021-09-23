

package leetcode.solutions;
import java.util.*;
/*
	Problem : 14
	Number leecode problem: 917
	https://leetcode.com/problems/reverse-only-letters/
    Time Complexity: O(n)
    Space Complexity: o(n)
*/

public class ReverseOnlyLetters {
	
	 public String reverseOnlyLetters(String s) {
		char c[] = s.toCharArray();
		int i = 0, j = c.length-1;
		
		while(i < j){
			while(i < j && !Character.isLetter(c[i]))i++;
			while(j > i && !Character.isLetter(c[j]))j--;
			
			if(Character.isLetter(c[i]), Character.isLetter(c[j])){
				char aux = c[i];
				c[i++] = c[j];
				c[j--] = aux;
			}
		}
		
		return String.valueOf(c);
	 }
}