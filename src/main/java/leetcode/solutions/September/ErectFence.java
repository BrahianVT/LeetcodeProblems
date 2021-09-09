package leetcode.solutions;
import java.util.*;
/*
	Problem : 3
	Number leecode problem: 587
	https://leetcode.com/problems/erect-the-fence/
    Time Complexity: O(nlogn)
    Space Complexity: O(n)
*/


public class  ErectFence{

	public int[][] outerTrees(int[][] trees) {
		Arrays.sort(trees, (p, p2) -> p[0] == p2[0]?p2[1]-p1[1]:p2[0] - p[0]);
		
		Stack<int[]> hull = new Stack<>();
		int n = trees.length;
		
		for(int i = 0; i < n; i++){
			while(hull.size() >= 2 && ori(hull.get(hull.size()-2),hull.get(hull.size()-1), trees[i]) > 0)
				hull.pop();
			hull.push(trees[i]);
		}
		hull.pop();
		
		for(int i = n -1; i >= 0; i--){
			int m = hull.size();
			while(m >= 2 && ori(hull.get(m-2), hull.get(m-1), trees[i]) > 0){hull.pop(); m = hull.size(); }
		}
		
		HashSet<int[]> set = new HashSet<>(hull);
		
		return set.toArray(new int[set.size()][]);
    }
	
	public int ori(int[] p, int[] q, int[] r){
		return (q[1] - p[1]) * (r[0] - q[0]) - (q[0] - p[0]) * (r[1] - q[1]);
	}
}