

package leetcode.solutions;
import java.util.*;
/*
	8
	Number leecode problem:17
	https://leetcode.com/problems/letter-combinations-of-a-phone-number/
    Time Complexity: O(2^n) 
    Space Complexity: O(2^n)
*/


public class LetterCombinationsPhoneNumber{
	public List<String> letterComb(String digits){
		char[][] map = {{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
		List<String> res = new ArrayList();
		if(digits.length == 0)return res;
		back(map, digits, res,0, new StringBuilder());
		return res;
	}
	
	private void back(char[][] map, String digits, List<String> res, int s, StringBuilder aux){
		if(aux.length() == digits){
			res.add(aux.toString()); return;
		}
		int j = digits.charAt(s) - '0';
		for(int i = 0; i < map[j].length; i++){
			aux.append(map[j][i]);
			back(map, digits, res, s+1, aux);
			aux.deleteCharAt(aux.length() - 1);
		}
	}
	
}