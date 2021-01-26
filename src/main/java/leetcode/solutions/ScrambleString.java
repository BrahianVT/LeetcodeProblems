
package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 87
	https://leetcode.com/problems/scramble-string/
    Time Complexity: O(2^n)
    Space Complexity: O(2^n)
	
*/

 public class ScrambleString{
	public boolean isScramble(String s1, String s2){
		if(s1.equals(s2))return true;
		int[] s1Arr = int[26], s2Arr = new int[26];
		
		int s = s1.length();
		for(int i = 0; i < s; i++){ s1Arr[s1.charAt(i)]++; s2Arr[s2.charAt(i)]++; }
		for(int i = 0; i < s; i++ ){ if(s1Arr[i] != s2Arr[i]) return false; }
		
		for(int i = 1; i < s; i++){
			if(isScramble(s1.substring(0,i), s2.substring(0,i)) &&
			   isScramble(s1.substring(i), s2.substring(i)))
			   return true;
			
			if(isScramble(s1.substring(0,i), s2.substring(s - i)) &&
			   isScramble(s1.substring(i), s2.substring(0, s - i)))
			   return true;
		}
	}
 }
