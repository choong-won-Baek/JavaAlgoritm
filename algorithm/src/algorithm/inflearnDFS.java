package algorithm;
import java.util.*;

class Node{
	int data;
	Node lt,rt;
	
	public Node(int val){
		data=val;
		lt=rt=null;
	}
}


public class inflearnDFS {
	Node root;
	public void DFS(Node root) {
		if(root == null) return;
		else {
			
			DFS(root.lt);
			System.out.print(root.data+" "); // 중위 순회 
			DFS(root.rt);
		}
		
	}
 public static void main(String[] args) {
	 inflearnDFS tree = new inflearnDFS(); //root를 사용하기 위해서 참조 
	 tree.root = new Node(1);
	 tree.root.lt = new Node(2);
	 tree.root.rt = new Node(3);
	 tree.root.lt.lt = new Node(4);
	 tree.root.lt.rt = new Node(5);
	 tree.root.rt.lt = new Node(6);
	 tree.root.rt.rt = new Node(7);
	 tree.DFS(tree.root);
	 }
}
