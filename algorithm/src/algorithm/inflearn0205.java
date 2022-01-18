package algorithm;
import java.util.*;
public class inflearn0205 {
	public static int solution(int n) {
	  int[] a = new int[n+1];
	  int answer =0;
	  for(int i=2; i<n;i++) {
		  if(a[i]==0) {
			  answer++;
			  for(int j=i; j<n; j=j+i) {
				  a[j]=1;
			  }
		  }
		  
	  }
	  return answer;
	}
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n =sc.nextInt();
	System.out.println(solution(n));
}
}
