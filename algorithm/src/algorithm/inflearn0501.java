package algorithm;
import java.util.*;

public class inflearn0501 {
	public static String solution(String in) {
		String answer = "YES";
		/*
		char[] temp = in.toCharArray();
		int count = 0;
		for(int i =0; i<temp.length; i++) {
			if(temp[i]=='(') count++;
			else count--;
			if(count<0) {
				answer = "NO";
				break;
			}
		}
		if(count!=0) answer ="NO";
	
		return answer;
		*/
		Stack<Character> stack = new Stack<>();
		for(char i : in.toCharArray()) {
			if(i=='(') stack.push(i);
			else {
				if(stack.isEmpty()) return "NO";
				stack.pop();
			}
		}
		if(!stack.isEmpty()) return "NO";
		
		return answer;
		
	}
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String in = sc.next();
	System.out.println(solution(in));
	
}
}
