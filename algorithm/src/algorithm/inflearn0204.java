package algorithm;
import java.util.*;
//1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.

//2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.
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
