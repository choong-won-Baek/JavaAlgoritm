package algorithm;
import java.util.*;
public class inflearn0605 {
	public static char solution(int[] a) {
		
		char answer = 'U';
		/*
		Arrays.sort(a);
		for(int i =0; i<a.length-1; i++) {
			if(a[i]==a[i+1]) return 'D';
		}
		*/
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i : a) {
			hm.put(i, hm.getOrDefault(i, 0)+1);
			if(hm.get(i)>1) return 'D';
		}
		return answer;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int m = sc.nextInt();
		int[] a = new int[m];
		
	    for(int i =0; i <m; i++) {
	    	a[i] = sc.nextInt();
	    }
	    System.out.println(solution(a));
	
}
}