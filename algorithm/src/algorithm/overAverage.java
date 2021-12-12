package algorithm;
import java.util.*;

public class overAverage {
 public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
	 int n = sc.nextInt();
	 int[] a = new int[n];
	 for(int i=0; i<n; i++) {
		 a[i] = sc.nextInt();
	 }
	 int sum = 0;
	  for(int i=0; i<n; i++) {
		  sum+=a[i];
	  }
	  int avg = sum/n;
	  int count = 0;
	  for(int i=0; i<n; i++) {
		 if(a[i]>avg) {
			 count++;
		 }
	  }
	  double answer = count/(double)n;
	  
	  System.out.print((double)Math.round(answer*100000)/1000+"%");
	  
 }
	
	
}
//대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.

