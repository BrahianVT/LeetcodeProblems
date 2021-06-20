package leetcode.solutions;
import java.util.*;
/*
	Problem : 15
	Number leecode problem: 473
	https://leetcode.com/problems/matchsticks-to-square/
    Time Complexity: O(2^n) 
    Space Complexity: O(1)
*/



public class MatchsticksSquare{
	public boolean makesquare(int[] matchsticks) {
        int sum = 0;
		for(int n : matchsticks)sum+=n;
		if(sum%4 != 0)return false;
		
		return dfs(new int[4], matchsticks, matchsticks.length, sum/4);
    }
	
	private boolean dfs(int[] eles, int[] nums, int j, int side){
		if(j == -1)return true;
		
		for(int i = 0; i < 4; i++){
			if(eles[i] + nums[j] > side || i > 0 && nums[i] == nums[i-1])continue;
			eles[i]+=nums[j];
			if(dfs(eles, nums, j- 1, side)return true;
			eles[i]-=nums[j];
		}
		
		return false;
	}
}