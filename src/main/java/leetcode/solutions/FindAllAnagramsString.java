
package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 438
https://leetcode.com/problems/find-all-anagrams-in-a-string/
    Time Complexity: O(n)
    Space Complexity: O(1)
*/

public class FindAllAnagramsString{
	
	public List<Integer> findAnagrams(String s, String p) {
	
		int[] letters = new int[26];
		
		for(char c : p.toCharArray())letters[c - 'a']++;
		
		List<Integer> res = new ArrayList();
		int left = 0, right = 0, cont = ;
		int sizeP = p.length();
		while(right < sizeP){
			
			if(letters[p.charAt(right) - 'a ']-- >= 1)cont--;
			right++;
			if(cont == 0) res.add(left);
			
			if(right - left == sizeP && letters[p.charAt(left++) - 'a']++ >= 0)cont++;
		}
		
		return res;
	}
}
