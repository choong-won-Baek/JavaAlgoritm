package algorithm;
import java.util.*;

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
