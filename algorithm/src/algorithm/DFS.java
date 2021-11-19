package algorithm;
import java.util.*;
public class DFS {

	//public static ArrayList<ArrayList<Integer>> graph= new ArrayList<ArrayList<Integer>>();
	public static int[][] arr = {{},{2,3,8},{1,7},{1,4,5},{3,5},{3,4},{7},{2,6,8},{1,7}};
	public static boolean[] visited = new boolean[9];
	public static void dfs(int x) {
		visited[x]=true;
		System.out.print(x+" ");
		for (int i=0; i<arr[x].length; i++) {
			int y = arr[x][i];
			if(visited[y]!=true) {
				dfs(y);
			}
		}
	}
	public static void main(String[] args) {
		dfs(1);
}
}
