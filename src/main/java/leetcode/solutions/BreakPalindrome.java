package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 1328
	https://leetcode.com/problems/break-a-palindrome/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/

public class BreakPalindrome{
	public String breakPalindrome(String palindrome){
		char[] pal = palindrome.toCharArray(palindrome);
		if(pal.length == 1)return "";
		for(int i = 0; i < pal.length; i++){
			if(pal[i] != 'a'){
				if(pal.length%2 == 1 && i == pal.length/2 && pal[pal.length-1] == 'a')pal[pal.length -1] = 'b';
				else pal[i] == 'a';
				return String.valueOf(pal);
			}
		}
		
		pal[pal.length -1] = 'b'; 
		return String.valueOf(pal);
	}
}