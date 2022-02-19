package algorithm;
import java.util.*;
/*현수의 아빠는 제과점을 운영합니다. 현수 아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 최대 매출액이 얼마인지 구하라고 했습니다.

만약 N=10이고 10일 간의 매출기록이 아래와 같습니다. 이때 K=3이면

12 1511 20 2510 20 19 13 15

연속된 3일간의 최대 매출액은 11+20+25=56만원입니다.

여러분이 현수를 도와주세요.*/
public class inflearn0303 {
	public static int solution(int n, int m, int a[]) {
		
		int answer =0;
		int sum =0;
		for(int i=0; i<m; i++) sum+=a[i];
		answer = sum;
		for(int i=m;i<n;i++) {
			sum+=a[i]-a[i-m];
			answer = Math.max(answer, sum);
		}
		return answer;
	}
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n= sc.nextInt();
	int a[] = new int[n];
	int m = sc.nextInt();
	
	for(int i=0;i<n;i++) {
		a[i] = sc.nextInt();
	}
	System.out.println(solution(n, m, a));
}
}
