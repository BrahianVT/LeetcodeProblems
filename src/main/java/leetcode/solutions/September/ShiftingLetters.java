package leetcode.solutions;
import java.util.*;
/*
	Problem : 8
	Number leecode problem: 206
	https://leetcode.com/problems/shifting-letters/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/



public class ShiftingLetters{
	
	 public String shiftingLetters(String s, int[] shifts) {
        char[] c = s.toCharArray();
		int sh = 0;
		for(int i = c.length -1; i >= 0; i--){
			sh = (sh + shifts[i]) % 26;
			c[i] = (char)((c[i] - 'a' + sh) % 26 + 'a');
		}
		
		return String.valueOf(c);
    }
}