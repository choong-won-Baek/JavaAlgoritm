package algorithm;
import java.util.*;
//영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,
//특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.

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
