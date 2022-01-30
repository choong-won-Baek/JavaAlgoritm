package algorithm;
import java.util.*;
public class inflearn0504 {
	public static int solution(String s) {
		Stack<Integer> st = new Stack<>();
	  for(char i : s.toCharArray()) {
		  if(i>='0'&&i<='9') {
			  int temp =i-'0';
			  st.push(temp);
		  }else if(i=='+') {
				 st.push(st.pop()+st.pop());
			 }else if(i=='-') {
				 int p1 = st.pop();
				 st.push(st.pop()-p1);
			 }else if(i=='*') {
				 st.push(st.pop()*st.pop());
			 }else if(i=='/') {
				 int p1 = st.pop();
				 st.push(st.pop()/p1);
			 }
		  }
	  return st.pop(); 
	  }
	
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String s = sc.next();
	System.out.println(solution(s));
	
}
}
