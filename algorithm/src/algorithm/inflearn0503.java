package algorithm;
import java.util.*;

public class inflearn0503 {
	public static int solution( int[][] a, int[] b) {
		Stack<Integer> st = new Stack<>();
		int answer =0;
	
		for(int pos : b) {
			for(int i=0; i<a.length; i++) {
			if(a[i][pos-1] != 0) {
				if(st.size()>0) {
				if(a[i][pos-1]!=st.peek()) {
				st.push(a[i][pos-1]);
				a[i][pos-1] =0;
				}else {
					st.pop();
					answer +=2;
					a[i][pos-1] =0;
				}
				}else {
					st.push(a[i][pos-1]);
					a[i][pos-1] =0;
				}
			break;
			}
			}
		}
		return answer;
	}
	
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   
   int[][] a = new int[n][n];
   
   for(int i =0; i<n; i++) {
	   for(int j=0; j<n; j++) {
		   a[i][j] = sc.nextInt();
	   }
   }
   int m = sc.nextInt();
   int[] b = new int[m];
   for(int i=0; i<m; i++) {
	   b[i] = sc.nextInt();
   }
   System.out.println(solution(a, b));
}
}
