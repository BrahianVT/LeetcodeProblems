package leetcode.solutions;
import java.util.*;
/*
	Problem : 22
	Number leecode problem: 1239
	https://leetcode.com/problems/maximum-length-of-a-concatenated-string-with-unique-characters/
    Time Complexity: O(n^2)
    Space Complexity: O(2^n)
*/


public class MaximumLengthConcatenatedStringUniqueCharacters{
	
	 public int maxLength(List<String> arr) {
        List<Integer> dp = new ArrayList();
		dp.add(0);
		int res = 0;
		for(String s : arr){
			int a = 0, duplicate = 0;
			for(char c: s.toCharArray()){
				duplicate |= a & (1 << (c - 'a'));
				a |= 1 << ( c - 'a');
			}
			if(duplicate > 0) continue;
			for(int i = dp.size() -1; i>= 0; i--){
				if((dp.get(i) & a) > 0)continue;
				dp.add(dp.get(i) | a);
				res = Math.max(res, Integer.bitCount(dp.get(i) | a));
			}
		}
		
		return res;
    }
}