package algorithm;
import java.util.*;
public class inflearn0202 {
	public static int solution(int n, int[] arr) {
		/*int answer =0;
		Loop:
		for(int i=0; i<n;i++) {
		    
			for(int j=0; j<i; j++) {
				if(arr[j]>=arr[i]) continue Loop;
				
			}
			answer++;
			
		}*/
		
		int answer =1;
		int max =arr[0];
		for(int i=1 ;i<n; i++) {
			if(arr[i]>max) {
				max=arr[i];
				answer++;
			}
		}
		
		return answer;
	}
	
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	 int[] arr = new int[n];
	 for(int i=0; i<n; i++) {
		 arr[i] = sc.nextInt();
	 }
	 System.out.println(solution(n, arr));
	 
	 
 }
	
}
