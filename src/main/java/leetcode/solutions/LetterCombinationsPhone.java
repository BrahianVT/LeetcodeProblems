
package leetcode.Solutions;

/**
   Number leecode problem: 17
   Link: https://leetcode.com/problems/letter-combinations-of-a-phone-number/
   
   Time Complexity: O(n^4)
   Space Complexity: O(n^4)
*/


public class LetterCombinationsPhone{
	
	
	public List<String> letterCombinations(String digits) {
		
		List<String> res = new ArrayList<>();
		char[][] map = {{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},{'p','q','r','s'},{'t','u','v'},{'w','x','y','z'}};
		
		backtracking(digits, map, start, new StringBuilder(), res);
		
		return res;
		
	}
	
	public void backtracking(String digits, char[][] map, int start, StringBuilder str, List<String> res){

		if(start == digits.length()){ res.add(str.toString());  return; }

		int i = digits.charAt(start) - '0'; 
		
		for(int j = 0; j < map[i].length; j++){
			str.append(map[i][j]);
			
			backtracking(digits, map, start + 1, str, res);
			str.deleteCharAt(str.length() - 1);
		}
	}
}