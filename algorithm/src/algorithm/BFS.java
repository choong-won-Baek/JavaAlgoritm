package algorithm;
import java.util.*;
public class BFS {
   public static boolean[] visited = new boolean[9];
   public static int[][] arr = {{},{2,3,8},{1,7},{1,4,5},{3,5},{3,4},{7},{2,6,8},{1,7}};

   public static void dfs(int x) {
	   Queue<Integer> q = new LinkedList<Integer>();
	   q.offer(x);
	   visited[x]=true;
	  
	   while(!q.isEmpty()) {
		   int y = q.poll();
		   System.out.println(y+" ");
		   for(int i =0; i<arr[y].length; i++) {
			   if(!visited[arr[y][i]]) q.offer(arr[y][i]);
			   visited[arr[y][i]]=true;
		   }
		   
	   }
	   
   }
   public static void main(String[] args) {
	   dfs(1);
   }
}
