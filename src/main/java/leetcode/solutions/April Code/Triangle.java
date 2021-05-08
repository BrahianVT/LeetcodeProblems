
package leetcode.solutions;
import java.util.*;
/*
	21
	Number leecode problem: 589
https://leetcode.com/problems/triangle/
    Time Complexity: O(n) 
    Space Complexity: O(n)
*/      
public class Triangle{

	public int minimumTotal(List<List<Integer>> triangle){
		for(int i = triangle.size()-1; i >= 0; i--){
			for(int j = 0; j < triangle.get(i).size(); j++){
				res[j] = Math.min(res[j], res[j + 1]) + triangle.get(i).get(j);
			}
		}
		return res[0];
	}
}