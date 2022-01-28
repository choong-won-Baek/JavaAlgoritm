package algorithm;
import java.util.*;

public class inflearn0604 {
public static int[] solution(int n, int m, int[] a) {
		/*LinkedList<Integer>  b = new LinkedList<>();
	for(int i=0; i<n;i++) {
		b.addFirst(0);
	}
		for(int i=0; i<m; i++) {
			if(b.contains(a[i])) {
				b.remove(a[i]);
				b.addFirst(a[i]);
			}else {
				b.addFirst(a[i]);
				b.removeLast();
			}
		}
		return b;*/
	int[] b = new int[n];
	for(int j =0; j<m; j++) {
		int pos =-1;
		for(int x =0; x<n; x++) if(a[j] == b[x]) pos =x;
	if(pos==-1) {
		for(int i=n-1; i>=1;i--) {
		    b[i] = b[i-1];
	
		}
	}else {
	for(int i = pos; i>=1;i--) {
	    b[i] = b[i-1];
	    
	}
	}
    b[0] = a[j];
	}
	return b;
}
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int m = sc.nextInt();
	int[] a = new int[m];
	
    for(int i =0; i <m; i++) {
    	a[i] = sc.nextInt();
    }
    for(int i : solution(n,m,a)) {
    	System.out.print(i+" ");
    }
}
}
