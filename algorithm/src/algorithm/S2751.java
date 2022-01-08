package algorithm;
import java.util.*;
public class S2751 {
	
	public static void main(String[] args) {
		Scanner in =  new Scanner(System.in);
		int n = in.nextInt();
	    StringBuilder sb = new StringBuilder();
		ArrayList<Integer> sort = new ArrayList<>(n);
		for(int i=0; i<n;i++) {
			sort.add(in.nextInt());
		}
		
		Collections.sort(sort);
		
		for(int value : sort) {
			sb.append(value).append("\n");
		}
		System.out.print(sb);
	
	}

}
