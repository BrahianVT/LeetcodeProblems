
package leetcode.solutions;
import java.util.*;
/*
	15
	Number leecode problem: 65
	https://leetcode.com/problems/valid-number/
	Time Complexity: O(n)
	Space Complexity: O(n)
*/   


public class ValidNumber{
	
	public boolean isNumber(String s) {
        char[] c = s.toCharArray();
		boolean isNumber = false, isExp = false, isDec = false;
		
		for(int i = 0; i < c.length; i++){
			char a = c[i];
			switch(a){
				case '.':
					if(isDec || isExp)return false;
					isDec = true; isNumber = false;
				break;
				case 'e':
				case 'E':
					if(!isNumber || isExp)return false;
					isExp = true; isNumber = false;
				break;
				case '+':
				case '-':
					if(i > 0 && Character.toLowerCase(c[i-1]) != 'e')return false;
					isNumber = false;
				break;
				default:
				if(c[i] < '0' || c[i] > '9')return false;
				isNumber = true;
				
			}

		}
		
		return isNumber;
    }

}