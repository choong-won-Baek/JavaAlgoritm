package algorithm;
import java.util.*;
public class pivonachi {//피보나치 수열 

	//public static long[] a = new long[100];
/*	public static void main(String[] args) {
		a[1]=1;
		a[2]=1;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i=3; i<=n;i++) {
			a[i]=a[i-1]+a[i-2];
		}
		System.out.println(a[n]);
	}
	*/
	static int[] p;
	public static int pivo(int x) {
		
		/*if(x==1 || x==2) {
			return 1;
		}
		return pivo(x-1) + pivo(x-2);*/
		
		if(x==1) return p[1]=1;
		else if(x==2) return p[2]=2;
		else if(p[x]>0) return p[x];
		else return p[x]=pivo(x-1)+pivo(x-2);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		//System.out.println(pivo(x));
		p=new int[x+1];
		pivo(x);
		System.out.print(p[x]);
	}
	
}
