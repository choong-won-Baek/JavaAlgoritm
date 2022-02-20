package algorithm;
import java.util.*;

public class inflearn0302 {
	//A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.


	public static ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
		ArrayList<Integer> answer = new ArrayList<Integer>();
	    Arrays.sort(a);
	    Arrays.sort(b);
		int p1=0; int p2 =0;
		while(p1<n && p2 < m) {
			if(a[p1] == b[p2]) {
				answer.add(a[p1++]);
				p2++;
			}else if(a[p1]<b[p2]) p1++;
			else p2++;
			}
		
		return answer;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n =sc.nextInt();
	int[] a = new int[n];
	for(int i =0; i<n; i++) {
		a[i] = sc. nextInt();
	}
	
	int m = sc.nextInt();
	int[] b = new int[m];
	for(int i =0; i<m; i++) {
		b[i] = sc.nextInt();
	}
	for(int i : solution(n,m,a,b)) {
		System.out.print(i+" ");
	}
}
}
