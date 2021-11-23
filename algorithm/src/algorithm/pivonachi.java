package algorithm;
import java.util.*;
public class pivonachi {//피보나치 수열 

	public static long[] a = new long[100];
	public static void main(String[] args) {
		a[1]=1;
		a[2]=1;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i=3; i<=n;i++) {
			a[i]=a[i-1]+a[i-2];
		}
		System.out.println(a[n]);
	}
}
