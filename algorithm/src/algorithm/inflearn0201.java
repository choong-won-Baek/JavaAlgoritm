package algorithm;
import java.util.*;

public class inflearn0201 {
	
	public static ArrayList<Integer> solution(int n, int[] arr){
		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(arr[0]);
		for(int i=1; i<n; i++) {
			if(arr[i-1]<arr[i]) answer.add(arr[i]);
		}
		
		return answer;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	int[] arr = new int[n];
	for(int i=0; i<n;i++) {
		arr[i] = sc.nextInt();
	}
	for(int i : solution(n, arr)) {
		System.out.print(i+" ");
	}
}
}
