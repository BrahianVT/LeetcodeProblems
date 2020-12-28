
package leetcode.solutions;
import java.util.*;
/**
	Number leecode problem: 125
	https://leetcode.com/problems/valid-palindrome/
    Time Complexity: O(n)
    Space Complexity: O(1)
*/
public class ValidPalindrome{
	public boolean isPalindrome(String s) {
	  
		int start = 0, end = s.length() - 1;
		while(start < end){
			char atStart = Character.toLowerCase(s.charAt(start));
			char atEnd = Character.toLowerCase(s.charAt(end));
			
			while(start < s.length() - 1 && (atStart < 'a' || atStart > 'z') || Character.isDigit(atStart)){
				atStart = Character.toLowerCase(++start);
			}
			while(end > 0 && (atStart < 'a' || atStart > 'z') || Character.isDigit(atEnd)){
				atEnd = Character.toLowerCase(--end);
			}
			if(atStart != atEnd && start < end)return false;
			start++; end--;
		}
	}
	
	return true;
}
  