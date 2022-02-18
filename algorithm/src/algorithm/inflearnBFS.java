package algorithm;
import java.util.*;
/*class Node{
	int data;
	Node lt,rt;
	
	public Node(int val){
		data=val;
		lt=rt=null;
	}
}*/
public class inflearnBFS {
	
		Node root;
		public void BFS(Node root) {
			Queue<Node> q = new LinkedList<>();
			q.offer(root);
			while(!q.isEmpty()) {
			  int len = q.size();
				for(int i=0; i<len; i++) {
					Node cur = q.poll();
					System.out.print(cur.data+" ");
					if(cur.lt != null) q.offer(cur.lt);
					if(cur.rt != null) q.offer(cur.rt);
				}
				System.out.println();
			}
			
		}
	 public static void main(String[] args) {
		 inflearnBFS tree = new inflearnBFS(); //root를 사용하기 위해서 참조 
		 tree.root = new Node(1);
		 tree.root.lt = new Node(2);
		 tree.root.rt = new Node(3);
		 tree.root.lt.lt = new Node(4);
		 tree.root.lt.rt = new Node(5);
		 tree.root.rt.lt = new Node(6);
		 tree.root.rt.rt = new Node(7);
		 tree.BFS(tree.root);
		 }
	}


