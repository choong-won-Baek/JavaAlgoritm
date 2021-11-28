package algorithm;
import java.util.*;
public class binarySum {
	
	
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	String a = sc.next();
	 String b = sc.next();
	 
	 int a1 = Integer.parseInt(a, 2);
	 int b1 = Integer.parseInt(a, 2);
	 
	
	 String result = Integer.toBinaryString(a1+b1);
	 System.out.println(Integer.parseInt(result));
 }
}
