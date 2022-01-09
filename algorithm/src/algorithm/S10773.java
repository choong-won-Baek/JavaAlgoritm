package algorithm;
import java.util.*;
public class S10773 {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 
	 int roof = sc.nextInt();
	 Stack<Integer> stack = new Stack<Integer>();
	 
	 for(int i=0; i<roof; i++) {
		 int input = sc.nextInt();
		 if(input ==0) {
			 stack.pop();
		 }else {
			 stack.push(input);
		 }
	 }
	 sc.close();
	 int sum =0;
	 for(Integer i : stack) {
		 sum+=i;
	 }
	 System.out.println(sum);
 }
	
}
