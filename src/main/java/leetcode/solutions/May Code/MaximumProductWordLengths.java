
package leetcode.solutions;
import java.util.*;
/*
	27
	Number leecode problem: 318
	https://leetcode.com/problems/maximum-product-of-word-lengths/
	Time Complexity: O(n^2)
	Space Complexity: O(1)
*/

public class MaximumProductWordLengths{

	public int maxProduct(String[] words) {
        int res = 0;
		int[] map = int[words.length];
		for(int i = 0; i < words.length; i++){
			int a  = 0;
			for(char c : words[i].toCharArray())
				a|= 1 << c - 'a';
			map[i] = a;
			
		}
		
		for(int i = 0; i < words.length-1; i++){
			for(int j = i+1; j < words.length; j++){
				if((map[i] & map[j]) == 0)res = Math.res(res, words[i].length() * words[j].length());
			}
		}
		
		return res;
    }
}