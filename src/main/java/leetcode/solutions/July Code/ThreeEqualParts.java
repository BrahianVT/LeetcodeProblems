

package leetcode.solutions;
import java.util.*;
/*
	Problem : 17
	Number leecode problem: 927
	https://leetcode.com/problems/three-equal-parts/submissions/
    Time Complexity: O(n) 
    Space Complexity: O(1)
*/



	public class ThreeEqualParts {
		public int[] threeEqualParts(int[] arr) {
			int totalOnes = 0;
			for(int n: arr)if(n == 1)totalOnes++;
			
			if(totalOnes%3 != 0)return new int[]{-1, -1};
			totalOnes/=3;
			
			if(totalOnes == 0)return new int[]{0, arr.length-1};
			
			int j = arr.length -1, auxOnes = 0;
			StringBuilder aux = new StringBuilder();
			for(; j >=0; auxOnes < totalOnes; j--){
				aux.insert(0, arr[j]);
				if(arr[j] == 1)auxOnes++;
			}
			
			int i = 0;
			while(arr[i] == 0)i++;
			
			int k = 0;
			while(k < aux.length()){
				if(arr[i + k] == aux.charAt(k) - '0')k++;
				else return new int[]{-1,-1};
			}
			
			int left = i + k - 1;
			k = 0;
			while(arr[i] == 0)i++;
			while(k < aux.length()){
				if(arr[i + k] == aux.charAt(k) - '0')k++;
				else return new int[]{-1,-1};
			}
			
			return new int[]{left, i +k};
			
		}
	}
	