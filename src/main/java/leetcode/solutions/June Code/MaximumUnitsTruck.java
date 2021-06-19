


package leetcode.solutions;
import java.util.*;
/*
	Problem : 14
	Number leecode problem: 1710
	https://leetcode.com/problems/maximum-units-on-a-truck/
    Time Complexity: O(n logn) 
    Space Complexity: O(1)
*/


public class MaximumUnitsTruck{
		
	public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (p1,p2) -> p2[1] - p1[1]);
		
		int res = 0, i = 0;
		while(i <  boxTypes.length && truckSize > 0){
			int aux[] = boxTypes[i];
			if(aux[0] <= truckSize){
				res+= (aux[0] * aux[1]);
				truckSize-=aux[0]; i++;
			} else {
				res+= truckSize*aux[1]; 
				truckSize=0;
			}
		}
		return res;
    }	
}