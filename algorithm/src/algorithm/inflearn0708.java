package algorithm;
import java.util.*;

public class inflearn0708 {
	public static int solution(int n,int m) {
		int answer=0;
		int temp = m-n;
		
		answer = temp/5;
		if(temp%5==0) return answer;
		
		if(m-answer*5 < (answer+1)*5 - m) {
			n=answer*5;
			 do{
				n++;
				answer++;
			}while(m!=n);
		}else {
			n=(answer+1)*5;
			answer++;
			do {
				n--;
				answer++;
			}while(m!=n);
		}
		return answer;
	}
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int n =sc.nextInt();
	 int m = sc.nextInt();
	 System.out.println(solution(n,m));
 }
}
