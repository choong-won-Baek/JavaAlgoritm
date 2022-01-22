package algorithm;
import java.util.*;

public class inflearn0403 {
public static ArrayList<Integer> solution(int n, int m, int[] a){
       
		ArrayList<Integer> answer = new ArrayList<Integer>();
		/*for(int i=0; i<=n-m;i++) {
	    HashSet<Integer> temp = new HashSet<>();
	    for(int j =i; j<i+m; j++) {
	    	temp.add(a[j]);
	    }
	    answer.add(temp.size());
		}
		return answer;
		*/
		HashMap<Integer,Integer> hm = new HashMap<>(); 
        for(int i=0; i<m-1; i++) {
        	hm.put(a[i],hm.getOrDefault(a[i], 0)+1);
        }
        int lt=0;
        for(int rt=m-1; rt<n;rt++) {
        	hm.put(a[rt], hm.getOrDefault(a[rt], 0)+1);
        	answer.add(hm.size());
        	hm.put(a[lt], hm.get(a[lt])-1);
        	if(hm.get(a[lt])==0) {hm.remove(a[lt]);}
        	lt++;
        }
		return answer;
	}
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int m= sc.nextInt();
	
	int[] a = new int[n];
	for(int i=0; i<n; i++) {
		a[i] = sc.nextInt();
	}
	for(int i : solution(n, m, a)) {
		System.out.print(i+" ");
	}
}
}
