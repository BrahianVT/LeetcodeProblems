package leetcode.solutions;
import java.util.*;
/*
	Problem : 6
	Number leecode problem: 1629
	https://leetcode.com/problems/slowest-key/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/

public class SlowestKey{

	public char slowestKey(int[] releases, String keys){
		char res = keys.charAt(0);
		int aux = 0, tTime = 0, i = 0;
		
		for(char c : keys.toCharArray()){
			if(releases[i] - aux > tTime){
				res = c;
				tTime = releases[i] - aux;
			} else if(releases[i] - aux == tTime && c > res){
				res = c;
			}
			aux = releases[i++];
		}
		
		return res;
	}
	
}