

package leetcode.solutions;
import java.util.*;
/*
	Problem : 4
	Number leecode problem: 752
	https://leetcode.com/problems/open-the-lock/
    Time Complexity: O(n) 
    Space Complexity: O(1)
*/


public class OpenLock{
		
	public int openLock(String[] deadends, String target) {
		  
        Set<String> set = new HashSet<>();
        for(String s : deadends){ set.add(s); }     
        char[] c = target.toCharArray();
        Deque<char[]> s = new ArrayDeque<char[]>();
        s.offer(new char[]{'0','0','0','0'});
        int res = 0;
        while(!s.isEmpty()){
            for(int i = s.size()-1; i >= 0; i--){
                char[] aux = s.pollFirst();
                if(!set.add(String.valueOf(aux))){  continue;}
                if(Arrays.equals(c, aux))return res;
                for(int j = 0; j < 4; j++){
                    char[] up = Arrays.copyOf(aux,4);
                    up[j] = (char)(up[j] == '9'?'0':up[j] + 1);
                    char[] down = Arrays.copyOf(aux, 4);
                    down[j] = (char)(down[j] == '0'?'9':down[j] - 1);
                    s.offer(up); s.offer(down);
                }
            }
            res++;
        }
        
        return -1;		
    }
}