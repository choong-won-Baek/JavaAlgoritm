package algorithm;
import java.util.*;
public class inflearn0603 {
	
		public static int[] solution(int[] a) {
		for(int i =1; i<a.length; i++) {
			int temp =a[i];
			int j;
			for(j =i-1; j>=0; j--) {
				if(a[j]>temp) {
					a[j+1]=a[j];
				}else {
					break;
				}
			}
			a[j+1]=temp;
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


