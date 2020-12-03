
package leetcode.solutions;
import java.util.*;
/**
	Number leecode problem: 680
	https://leetcode.com/problems/valid-palindrome-ii/
    Time Complexity: O(n)
    Space Complexity: O(1)
*/

public class ValidPalindromeII{
	
	public boolean validPalindrome(String s) {
		char[] c = s.toCharArray();
		int l = 0, r = c.length -1;
		while(l < r){
			if(c[l] != c[r]){
				return (validaPal(c, l + 1, r) || validaPal(c, l ,r - 1));
			}
			l++; r--;
		}
		return true;
	}
	
	private boolean validaPal(char[] c, int l ,int r){
		while( l < r){
			if(c[l++] != c[r--])return false;
		}
		return true;
	}
}