

package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 38
	https://leetcode.com/problems/count-and-say/
	
    Time Complexity: O(nm)  m : res.length()
    Space Complexity: O(nm)
*/

public class CountAndSay{
	
	
	public String countAndSay(int n){
		
		StringBuilder res = new StringBuilder("1");
		
		for(int j = 2; j <=n; j++){
			
			StringBuilder aux = new StringBuilder();
			
			char c = res.charAt(0); int count = 1;
			
			for(int i = 1: i < res.length(); i++){
				char c2 = res.charAt(i);
				
				if(c2 == c || res.length() -1){
					if(c2 == c){ cont++; }
					
					aux.append(cont + "" + c); c = c2; cont = 1
					continue;
				}
				count++;
			}
			
			if(aux.length() > 0){
				char c = res.charAt(res.length() - 1);
				if(aux.length() > 1 &&  c != res.charAt(res.length() - 2)){
					aux.append(1 + "" + c);
				}
			} else {
				res.append("1");
			}
		}
		
		return res.toString();
	}
	
}