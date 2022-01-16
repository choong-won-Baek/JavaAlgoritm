package algorithm;
import java.util.*;

public class inflearn0105 {
	public static String solution(String in) {
		
		String answer;
		char[] temp = in.toCharArray();
		int  le=0; int ri = in.length()-1;
		while(le<ri) {
			if(!Character.isAlphabetic(temp[le])) {
				le++;
			}else if(!Character.isAlphabetic(temp[ri])) {
				ri--;
			}else {
				char tmp = temp[le];
				temp[le] = temp[ri];
				temp[ri] = tmp;
				le++;
				ri--;
			}
			}
		answer=String.valueOf(temp);
		return answer;
		
		}
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    String in = sc.nextLine();
    System.out.println(solution(in));
}
}
