package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 93
https://leetcode.com/problems/restore-ip-addresses/
    Time Complexity: O(1)
    Space Complexity: O(1)
	
*/
 public class RestoreIPAddresses{
	 
	public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList();
		
		back(res, s ,new StringBuilder(), 0, 0);
		return res;
	}
	
	private void back(List<String> res, String s, StringBuilder aux, int pos, int sec){
		
		if(s.length() - pos > 3*(4 - sec))return;
		if(s.length() == pos && sec == 4){ res.add(aux.toString()); }
		
		for(int i = 1; i <= 3; i++){
			if(pos + i > s.length())return;
			
			String number = s.substring(i, i + pos);
			if(number.length() > 1 && number.startsWith("0") ||  i == 3 && Integer.parseInt(number) > 255)continue;
			back(res, s, sec == 0?aux.append(number): aux.append(".").append(number), pos + i, sec + 1);
			
			if(sec > 1)aux.deleteCharAt(aux.length() -1);
			aux.remove(aux.length() - i, aux.length());
		}
	}
 }