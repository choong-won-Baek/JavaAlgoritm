package algorithm;
import java.util.*;

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
