
package leetcode.solutions;
import java.util.*;
/*
	22
	Number leecode problem: 554
https://leetcode.com/problems/brick-wall/
    Time Complexity: O(n) 
    Space Complexity: O(n)
*/    

public class BrickWall{
	public int leastBricks(List<List<Integer>> wall) {
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        int res = 0;
        for(List<Integer> row: wall){
            int sum = 0;
            for(int i = 0; i < row.size() -1; i++){
                sum+=row.get(i);
                map.put(sum, map.getOrDefault(sum, 0) + 1);
                res = Math.max(res, map.get(sum));
            }
        }
        return wall.size() - res;	
    }
}