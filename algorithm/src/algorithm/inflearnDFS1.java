package algorithm;
import java.util.*;

public class inflearnDFS1 {
	static int n;
	static int[] ch;
public static void DFS(int L) {
	if(L==n+1) {
	 for(int i =1; i<n+1;i++){
		if(ch[i]==1) System.out.print(i+" ");
	 }
		System.out.println();
	}
	else {
		ch[L]=1;
		DFS(L+1);
		ch[L]=0;
		DFS(L+1);
	}
}
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	  n = sc.nextInt();
	  ch = new int[n+1];
	  DFS(1);
 }
}
