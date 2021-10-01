package leetcode.solutions;
import java.util.*;
/*
	Problem : 23
	Number leecode problem: 1328
	https://leetcode.com/problems/break-a-palindrome/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/

public class BreakPalindrome{
	
	public String breakPalindrome(String palindrome) {
		if(palindrome.length() == 1)return "";
		
		char[] pal = palindrome.toCharArray();
		for(int i = 0; i < pal.length; i++){
			if(pal[i] != 'a' && i != pal.length/2){
				pal[i] = 'a';
				return String.valueOf(pal);
			}
		}
		
		pal[pal.length-1] = 'b';
		return String.valueOf(pal);
	}
}