package algorithm;
import java.util.*;

public class inflearn0601 {
	public static int[] solution(int[] a) {
		for(int i=0; i<a.length-1; i++) {
		int min_idx=i;
		for(int j=i+1; j<a.length; j++) {
			if(a[min_idx]>a[j]) {
				min_idx=j;
			}
			int temp = a[i];
			a[i] = a[min_idx];
			a[min_idx]  =temp;
			
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
