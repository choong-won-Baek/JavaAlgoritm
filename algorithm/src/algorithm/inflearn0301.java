package algorithm;
import java.util.*;
public class inflearn0301 {
	public static ArrayList<Integer> solution(int[] a, int[] b) {
	/*	int len = a.length+b.length;
	   int[] answer = new int[len];
	   for(int i =0; i<len; i++) {
		   if(i<a.length) answer[i] = a[i];
		   else answer[i] = b[i-a.length];
	   }
	   Arrays.sort(answer);
	   */
		ArrayList<Integer> answer = new ArrayList<>();
		int p1 =0; int p2=0;
		while(p1<a.length && p2 <b.length) {
			if(a[p1]<b[p2]) {answer.add(a[p1++]);}
			else {answer.add(b[p2++]);}
		}
		while(p1<a.length) answer.add(a[p1++]);
		while(p2<b.length) answer.add(b[p2++]);
		
	   return answer;
	   
	}
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] a = new int[n];
	for(int i=0; i<n; i++) {
		a[i] = sc.nextInt();
	}
	
	int m = sc.nextInt();
	int[] b= new int[m];
	for(int i=0; i<m; i++) {
		b[i] = sc.nextInt();
	}
	
	for(int i : solution(a, b)) {
		System.out.print(i+" ");
	}
}
}
