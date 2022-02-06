package algorithm;
import java.util.*;
//N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요
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
