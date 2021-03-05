package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 1710
	https://leetcode.com/problems/maximum-units-on-a-truck/
    Time Complexity: O(n log n)
    Space Complexity: O(n log n)
*/

public class MaximumUnitsTruck{
	public int maximumUnits(int[][] boxTypes, int truckSize){
		Arrays.sort(boxTypes, (p1,p2) -> p1[1] == p2[1]?p1[0]-p2[0]:p2[1]- p1[1]);
		int res = 0, index = 0;
		while(index < boxTypes.length && truckSize > 0){
			int size = boxTypes[index][0];
			if(size <= truckSize){
				res+= size * boxTypes[index][1];
				truckSize-= size;
			} else {
				res+= truckSize * boxTypes[index][1];
				truckSize = 0;
			}
			index++;
		}
		
		return res;
	}
}
