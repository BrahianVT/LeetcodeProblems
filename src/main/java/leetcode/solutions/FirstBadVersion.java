
package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 278
	https://leetcode.com/problems/first-bad-version/
    Time Complexity: O(log n)
    Space Complexity: O(1)
*/


public class FirstBadVersion extends VersionControl {
    public int firstBadVersion(int n) {
		int start = 1, end = n;
		while(start < end){
			int m = start + (end - start)/2;
			if(isBadVersion(m)){
					e = m;
			} else{
				s = m +1;
			}
		}
			return start;
	}
}
	
