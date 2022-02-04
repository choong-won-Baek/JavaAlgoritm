package algorithm;
import java.util.*;
//한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요..


public class inflearn0101 {
    public static int soultion(String in, char in2) {
    	int count=0;
        in = in.toUpperCase();
        in2 = Character.toUpperCase(in2);
    	/*for(int i =0; i<in.length(); i++) {
    		if(in.charAt(i) == in2) { count++;}
    	}*/
       for(char i : in.toCharArray()) { if(i== in2) { count++;}}
    	return count;
    	
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.next();
		char in2 = sc.next().charAt(0);
		System.out.println(soultion(in, in2));
	}
}
