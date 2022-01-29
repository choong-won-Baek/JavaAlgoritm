package algorithm;
import java.util.*;
public class inflearn0702 { // 2진수 변환 구하기 재귀함수 사용해서 , 펙토리얼 
	public static int dfs(int n) {
		/*
		if(n==0) {
	
		return;
		}
		else{dfs(n/2);}
		System.out.print(n%2);
		*/
		if(n==1) return 1; 
	    return n*dfs(n-1);
	    
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	System.out.println( dfs(n));
	
}
}
