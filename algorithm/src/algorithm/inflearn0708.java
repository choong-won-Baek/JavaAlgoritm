package algorithm;
import java.util.*;

public class inflearn0708 {
	static int answer =0;
	static int[] dis = {1, -1, 5};
	static int[] ch;
	
	static Queue<Integer> Q = new LinkedList<>();
	
	public static int solution(int n,int m) {
	ch = new int[10001];
    ch[n] =1;
    Q.offer(n);
    int N =0;
    while(!Q.isEmpty()) {
    	int len = Q.size();
    	for(int i =0; i<len; i++) {
    		int cur = Q.poll();
    		for(int j : dis) {
    			int temp =cur+j;
    			if(temp==m) return N+1;
    			if(temp>0 && temp <10001 && ch[temp]==0) {
    				ch[temp]=1;
    				Q.offer(temp);
    			}
    		}
    	}
    	N++;
    }
    return 0;
	}
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int n =sc.nextInt();
	 int m = sc.nextInt();
	 System.out.println(solution(n,m));
 }
}
