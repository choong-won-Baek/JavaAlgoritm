package algorithm;
import java.util.*;

public class S2217 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
	    int rope[] = new int[n];
	    
	    for(int i =0; i< n; i++) {
	    	rope[i] = in.nextInt();
	    }
	    int min = rope[0];
	    
	    for(int i=1; i<n; i++) {
	       if( rope[i-1]> rope[i]) {
	    	   min = rope[i];
	       }
	    }
		System.out.println(min*n);
	    
	}
	
}
