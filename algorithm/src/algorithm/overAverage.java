package algorithm;
import java.util.*;

public class overAverage {
 public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
	 int[] arr;
	 int n = sc.nextInt();

	 
	 for(int j = 0; j<n; j++) {
		 
	 int m = sc.nextInt();
	 arr = new int[m];
	 double sum = 0;
	 for(int i=0; i<m; i++) {
		 int val = sc.nextInt();
		 arr[i] = val;
		 sum+=val;
	 }
	
	  double avg = sum/m;
	  double count = 0;
	  
	  for(int i=0; i<m; i++) {
		 if(arr[i]>avg) {
			 count++;
		 }
	  }
	
	  System.out.printf("%.3f%%\n", (count/m)*100);
	  
 }
	sc.close();
 }	
}
//대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.

