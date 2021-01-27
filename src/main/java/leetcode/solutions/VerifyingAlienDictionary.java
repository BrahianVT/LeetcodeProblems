

package leetcode.solutions;
import java.util.*;
/**
	Number leecode problem: 523
	https://leetcode.com/problems/verifying-an-alien-dictionary/
    Time Complexity: O(words.length * min)
    Space Complexity: O(1)
*/


public class VerifyingAlienDictionary{
	public boolean isAlienSorted(String[] words, String order) {
		int[] map = new int[26];
		int p = 0;
		for(char c : order.toCharArray()){
			map[c - 'a'] = p++;
		}
		
		for(int j = 0; j < words.length -1; j++){
			if(!validate(words[j].toCharArray(), words[j +1].toCharArray(), map))return false;
		}
		
		return true;
	}
	
	private boolean validate(char[] c1, char[] c2, int[] map){
		int n1 = c1.length , n2 = c2.length;
		
		int min = Math.min(n1, n2);
		
		for(int i = 0; i < min; i++){
			if(c1[i] - 'a' != c2[i] -'a'){
				return map[c1[i] - 'a'] < map[c2[i] - 'a'];
			}
		}
		return min == m1;
	}
	 
}
