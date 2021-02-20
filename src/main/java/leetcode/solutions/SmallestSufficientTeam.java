
package leetcode.solutions;
import java.util.*;
/*
	Number leecode problem: 1125
	https://leetcode.com/problems/smallest-sufficient-team/
    Time Complexity: O(2^n)
    Space Complexity: O(n)
*/

public class SmallestSufficientTeam{
	
	List<Integer> res = new ArrayList();
	public int[] smallestSuffientTeam(String[] req_skills, List<List<String>> people){
		Map<String, Integer> idx = new HashMap<>();
		int n = 0;
		for(String skill: req_skills)req_skills.add(skill, n++);
		int[] pe = new int[people.size()];
		for(int i = 0; i < pe.length; i++){
			for(String p: people.get(i)){
				int skill = idx.get(p);
				pe[i]+= 1 << skill;
			}
		}
		dfs(0, pe, new ArrayList(), n);
		int[] ans = new int[res.size()];
		for(int i = 0; i < res.size(); i++) ans[i] = res.get(i);
		return ans;
	}
	
	private void dfs(int cur, int[] pe, List<Integer> aux, int n){
		if(cur == (1<<n) -1){
			if(res.size() == 0 || aux.size() < res.size()){
				res = new ArrayList(aux);
			}
			return;
		}
		if(res.size() != 0 && aux.size() >= res.size())return;
		
		int zeroBit = 0;
		while((cur >> zeroBit)&1) == 1)zeroBit++;
		
		for(int i = 0; i < pe.length; i++){
			int per = pe[i];
			if(((per >> zeroBit) & 1) == 1){
				aux.add(i);
				dfs(cur | per, pe, aux, n);
				aux.remove(aux.size() -1);
			}
		}
	}
}