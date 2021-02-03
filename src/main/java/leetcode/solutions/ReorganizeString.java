package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 767
	https://leetcode.com/problems/reorganize-string/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/

public class ReorganizeString{
	public String reorganizeString(String s){
		int[] map = new int[26];
		for(char c : s.toCharArray()){
			map[c - 'a']++;
		}
		int max = 0, letter = 0;
		for(int i = 0; i < map.length; i++){
			if(map[i] > max){
				max = map[i]; letter = i;
			}
		}
		if(max > (s.length + 1)/2)return "";
		char[] res = new char[s.length()];
		int j = 0;
		while(map[letter] > 0){
			if(j >= res.length)j= 1;
			res[j] = (char)(i + 'a');
			j+=2;
			map[i]--;
		}
		return String.valueOf(res);
	}
}