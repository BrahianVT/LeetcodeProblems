

package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 50

	https://leetcode.com/problems/powx-n/
    Time Complexity: O(log n)
    Space Complexity: O(log n)
*/

public class Pow{
	public double myPow(double x, int n){
		double temp = x;
		if(n == 0){ return 1; }
		temp  = myPow(x , n/2);
		if(n %2 == 0){
			return temp * temp;
		} else if( n > 0){
			return x * temp * temp;
		} else{
			return temp * temp/x;
		}
	}
}