package leetcode.solutions;
import java.util.*;
/*
	Problem : 5
	Number leecode problem: 899
	https://leetcode.com/problems/orderly-queue/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/

public class OrderlyQueue{
	
	public String orderlyQueue(String s, int k){
		if(k > 1){ char[] c = s.toCharArray(); Arrays.sort(c); return String.valueOf(c); }
		else {
			String res = s;
			for(int i = 0; i < s.length(); i++){
				String temp = s.substring(i) + s.substring(0,i);
				if(temp.compareTo(res) < 0)
					res = temp;
			}
			
			return res;
		}
		
		
	}
}
