

package leetcode.solutions;
import java.util.*;
/*
	Problem : 21
	Number leecode problem: 838
	https://leetcode.com/problems/push-dominoes/
    Time Complexity: O(1) 
    Space Complexity: O(1)
*/


public class PushDominoes{

	public String pushDominoes(String dominoes) {   
		dominoes = 'L' + dominoes + 'R';
		char[] d = dominoes.toCharArray();
		
		StringBuilder res = new StringBuilder();
		for(int i = 0, j = 1; j < d.length; j++){
			if(d[j] == '.')continue;
			int mid = j -i -1;
			if(i > 0)res.append(d[i]);
			
			if(d[i] == d[j])
				for(int k = 0; k < mid; k++)res.append(d[i]);
			else if (d[i] == 'L' && d[j] == 'R')
				for(int k = 0; k < mid; k++)res.append('.');
			else {
				for(int t = 0; t < mid/2; t++)res.append('R');
				
				if(mid%2 == 1)res.append('.');
				
				for(int t = 0; t < mid/2; t++)res.append('L');
			}
			i = j;
		}
		
		return res.toString();
    }
}