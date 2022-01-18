package algorithm;
import java.util.*;

public class inflearn0305 {
	public static int solution(int n) {
		int answer =0;
		int sum=0;
		int lt=1;
		for(int rt=1; rt<=n/2+1; rt++) {
			sum+=rt;
			if(sum==n) answer++;
			while(sum>n) {
				sum-=lt++;
				if(sum==n) answer++;
			}
		}
		return answer;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n =sc.nextInt();
	System.out.println(solution(n));
	
}
	
}
