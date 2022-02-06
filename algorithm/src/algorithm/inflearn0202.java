package algorithm;
import java.util.*;
//선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는

//선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)



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
