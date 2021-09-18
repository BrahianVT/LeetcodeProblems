

package leetcode.solutions;
import java.util.*;
/*
	Problem : 11
	Number leecode problem: 954
	https://leetcode.com/problems/array-of-doubled-pairs/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/



public class  ArrayDoubledPairs{
	
	public boolean canReorderDoubled(int[] arr) {
		TreeMap<Integer, Integer> map = new TreeMap<>((p1,p2) -> Math.abs(p1) == Math.abs(p2)?p1-p2:Math.abs(p1)-Math.abs(p2));

		int three = 0;
		for(int n: arr){
			three+= n;
			map.put(n, map.getOrDefault(n, 0) + 1);
		}
		
		if(three % 3 != 0)return false;
		
		for(int even: map.keySet()){
			if(map.get(even) != 0){
				int doub = even * 2;
				if(map.containsKey(doub) && map.get(doub) >= map.get(even)){
					map.put(doub, map.get(doub) - map.get(even));
				} else return false;
			}
		}
		return true;
    }
}
