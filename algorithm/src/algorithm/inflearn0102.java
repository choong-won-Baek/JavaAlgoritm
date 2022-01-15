package algorithm;
import java.util.*;
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
