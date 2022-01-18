package algorithm;
import java.util.*;
public class inflearn0204 {
	/*public static int[] solution(int n){
		int[] answer = new int[n];
		answer[0]=1;
		answer[1]=1;
		for(int i =2; i<n;i++) {
			answer[i] = answer[i-1]+answer[i-2];
		}
		return answer;
		
	}*/
	public static void solution(int n) {
		int a=1;
		int b=1;
		System.out.print(a+" "+b+" ");
		for(int i=2; i<n; i++) {
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	solution(n);
	/*for(int i:solution(n)) {
		System.out.print(i+" ");
	}*/
}
}
