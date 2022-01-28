package algorithm;
import java.util.*;
public class inflearn0602 {
	public static int[] solution(int[] a) {
		for(int i=0; i<a.length-1; i++) {
			for(int j = 1; j<a.length-i; j++) {
				if(a[j-1]>a[j]) {
					int temp = a[j-1];
					a[j-1] = a[j];
					a[j]=temp;
				}
			}
			
		}
		return a;
		
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] a = new int[n];
	for(int i=0; i<n; i++) {
		a[i] = sc.nextInt();
	}
	for(int i : solution(a)) {
		System.out.print(i+" ");
	}
}
}
