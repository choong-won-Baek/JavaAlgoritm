package algorithm;
import java.util.*;

public class inflearn0304 {
	public static int solution(int n, int m, int[] a) {
		int answer=0;
		int sum =0;
		int lt=0;
		for(int rt =0; rt<n; rt++) {
			sum+=a[rt];
			if(sum==m) answer++;
			while(sum > m) {
				sum-=a[lt++];
				if(sum==m) answer++;
			}
		}
	
		return answer;
	}
	
public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      
      int[] a = new int[n];
      for(int i=0; i<n; i++) {
    	  a[i]= sc.nextInt();
      }
      System.out.println(solution(n,m,a));
	
}
}
