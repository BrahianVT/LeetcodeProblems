
package leetcode.solutions;
import java.util.*;
/*
	30
	Number leecode problem: 970
https://leetcode.com/problems/powerful-integers/
    Time Complexity: O(xy) 
    Space Complexity: O(bound)
*/

public class PowerfulIntegers{
	public List<Integer> powerfulIntegers(int x, int y, int bound) {
        List<Integer> res =  new ArrayList();
		boolean[] visited = new boolean[bound + 1];
		
		for(int  i = 1; i < bound; i*=x){
			for(int j = 1; i+j <= bound; j*=y){
				if(!visited[i+j]){ res.add(i+j); visited[i+j] = true; }
				if(y == 1)break;
			}
			if(x == 1)break;
		}
		return res;
    }
}