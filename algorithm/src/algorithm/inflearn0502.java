package algorithm;
import java.util.*;

public class inflearn0502 {
	public static String solution(String in) {
		char[] temp = in.toCharArray();
		String answer ="";
		Stack<Character> st = new Stack<>();
		for(char i : temp) {
			if(i ==')') {
				while(st.pop()!='(');
			}else {
				st.push(i);
			}
		}
		for( int i =0; i<st.size(); i++) {
			answer+=st.get(i);
		}
		return answer;
		}
	
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String in = sc.next();
	System.out.println(solution(in));
	
}
}
