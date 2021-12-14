package algorithm;
import java.util.*;
//열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.
public class reverseSort {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
    int num = in.nextInt();
    String temp = Integer.toString(num);
    Integer[] result = new Integer[temp.length()];
    
    for(int i =0; i<temp.length(); i++) { result[i] = temp.charAt(i) -'0';}
    
    Arrays.sort(result, Collections.reverseOrder());
    
    for(int i : result) {
    	System.out.print(i);
    }
}
}
