package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 65
	https://leetcode.com/problems/valid-number/
    Time Complexity: O(n)
    Space Complexity: O(1)
*/

public class ValidNumber{
	
	
	public boolean isNumber(String s){
		if(s == null || s.trim().length() == 0) return false;
		s = s.trim();
		
		boolean seenE = false, seenD = false, seenN = false;

		for(int i = 0; i < s.length(); i++){
			char n = s.charAt(i);
			switch(n){
				
				case '.':
					if(seenD || seenE) return false;
					seenD = true; break;
				case 'e':
					if(seenE || ! seenN) return false;
					seenE = true; seenN = false;   break;
				case '+':
				case '-':
					if(i != 0 && s.charAt(i - 1) != 'e')return false;
					 seenN = false; break;
				default: if(n - '0' < 0 || n - '0' > 9)return false;
				seenN = true;
			}
		}
		
		return seenN;
	}
}