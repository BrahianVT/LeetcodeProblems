package leetcode.solutions;
import java.util.*;
/*
	Problem : 8
	Number leecode problem: 1632
	https://leetcode.com/problems/rank-transform-of-a-matrix/
    Time Complexity: O(NNlog(MN)))
    Space Complexity: O(nm)
*/

public class RankTransformMatrix{
	
	public int find(int[] find, int id){
		while(find[id] != id){
			find[id] = find[find[id]];
			id = find[id];
		}
		return id;
	}
	
	public Pair<Integer> add(int[] find, int x, int y){
		int x2 = find(find, x);
		int y2 = find(find, y);
		find[x2] = y2;
		return new Pair<>(x2, y2);
	}
	public int[][] matrixRankTransform(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
		int[] rank = new int[n + m];
		
		Map<Integer, List<Pair<Integer, Integer>>> invMap = new TreeMap<>();
		for(int i = 0; i < n; i++)
			for(int j = 0; j < m; j++)
				invMap.computeIfAbsent(matrix[i][j], v -> new ArrayList()).add(new Pair(i, j));
			
		for(int key: invMap.keySet()){
			int[] find = new int[n + m];
			for(int i = 0; i < n+m; i++)find[i] = i;
			int[] rank2 = rank.clone();
			
			for(Pair<Integer, Integer> coor : invMap.get(key)){
				Pair<Integer, Integer> res = add(coor.getKey(), coor.getValue() + n, find);
				rank2[res.getValue()] = Math.max(rank2[res.getKey()], rank2[res.getValue()]);
			}
			
			for(Pair<Integer, Integer> coor: invMap.get(key)){
				rank[coor.getKey()] = rank[coor.getValue() + n]
								    = matrix[coor.getKey()][coor.getValue()]
									= rank2[find(find, coor.getKey())] + 1;
			}
		}
		return matrix;
	}
}