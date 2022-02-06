package algorithm;
import java.util.*;
//자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.
//만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.

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
