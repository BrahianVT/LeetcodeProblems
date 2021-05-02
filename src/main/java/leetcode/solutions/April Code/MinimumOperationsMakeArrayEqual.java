package leetcode.solutions;
import java.util.*;
/*
	6
	Number leecode problem:1551
https://leetcode.com/problems/minimum-operations-to-make-array-equal/
    Time Complexity: O(1) 
    Space Complexity: O(1)
*/


public class MinimumOperationsMakeArrayEqual{
	public int minOperations(int n){
        return n*n>>2;
    }
}
