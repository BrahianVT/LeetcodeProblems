package leetcode.solutions;
import java.util.*;
/**
 Number leecode problem: 133
	https://leetcode.com/problems/clone-graph/
    Time Complexity: O(n)
    Space Complexity: O(n)
*/

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

public class CloneGraph{
	Map<Integer, Node> map = new HashMap<>();
	public Node cloneGraph(Node node){
		
		return clone(node);
	}
	
	
	private Node clone(Node root){
		if(root == null){ return null; }
		
		if(map.containsKey(root.val)){ return map.get(root.val); }
		
		Node newNode = new Node(root.val);
		
		for( int i = 0; i < root.neighbors.size(); i++){
			
			newNode.neighbors.add(clone(root.neighbors.get(i)));
		}
		
		return newNode;
	}
}