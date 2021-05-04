

package leetcode.solutions;
import java.util.*;
/*
	9
	Number leecode problem:953
	https://leetcode.com/problems/verifying-an-alien-dictionary/
    Time Complexity: O(n) 
    Space Complexity: O(n)
*/
public class VerifyingAlienDictionary{
	
	public boolean isAlienSorted(String[] words, String order) {
		int[] map = new int[26];
		int i = 0;
		for(char c: order.toCharArray(order)){
			map[c - 'a'] = i++;
		}
		
		for(int i = 0; i < words.length -1; i++){
			if(!isSorted(words[i].toCharArray(), words[i+1].toCharArray(),map))return false;
		}
			
		return true;
    }
	
	private boolean isSorted(char[] c1, char[] c2, int[]  map){
		int n = Math.min(c1.length, c2.length);
		int i = 0;
		while(i < n){
			if(c1[i] != c2[i]){
				return map[c1[i - 'a']] <  map[c2[i - 'a']];
			}
			i++;
		}
		return c1.length = n;
	}
}