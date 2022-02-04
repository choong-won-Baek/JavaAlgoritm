package algorithm;
import java.util.*;
//한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.문장속의 각 단어는 공백으로 구분됩니다.
public class inflearn0103 {
   public static String solution(String in) {
	   int max=0, pos;
	   String answer= "";
	   while((pos = in.indexOf(" "))!=-1) {
		   String tmp = in.substring(0, pos);
		   if(tmp.length() > max) {
			   answer = tmp;
			   max = tmp.length();
		   }
		   in = in.substring(pos+1);
		   
		   if(in.length() > max) answer = in;
	   }
	   /* String[] temp = in.split(" ");
	   String max = temp[0];
	   for(String i : temp) {
		   if(i.length() > max.length()) max = i;
	   }
	   */
	   
	   
	   return answer;
   }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		System.out.println(solution(in));
		
	}
}
