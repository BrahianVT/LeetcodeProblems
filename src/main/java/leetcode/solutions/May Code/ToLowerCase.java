package leetcode.solutions;
import java.util.*;
/*

	24
	Number leecode problem: 943
	https://leetcode.com/problems/to-lower-case/
	Time Complexity: O(n)
	Space Complexity: O(n)
*/

public class ToLowerCase{
	 public String toLowerCase(String s) {
        char[] c = s.toCharArray();
		
		for(char i : c){
			if(i >= 'A' && i <= 'Z')i+=32;
		}
		
		return String.valueOf(c);
    }
}
