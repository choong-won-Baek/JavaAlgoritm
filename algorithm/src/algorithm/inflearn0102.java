package algorithm;
import java.util.*;
//한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요.

public class inflearn0102 {
    public static String solution(String in) {
        String str ="";
 /*
    	for(char i : in.toCharArray()){
    		if(Character.isUpperCase(i)) {
    			 str +=Character.toLowerCase(i);	
    		}else { str +=Character.toUpperCase(i);}
    	}
    	return str;
    }
	*/
        for(char i : in.toCharArray()){
    		if(i > 65 && i<90) {
    			 str +=(char)(i+32);	
    		}else { str += (char)(i-32);}
    	}
    	return str;
    }   
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.next();
		System.out.println(solution(in));
		
		
	}
}
