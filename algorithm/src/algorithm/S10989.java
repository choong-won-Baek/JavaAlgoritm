package algorithm;
import java.io.*;
import java.util.*;
public class S10989 {
public static void main(String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int N = Integer.parseInt(br.readLine());
	int[] count = new int[1001];
	
	
	for(int i =0; i<N; i++) { count[Integer.parseInt(br.readLine())]++;}
	br.close();
	
	StringBuilder sb = new StringBuilder();
	for(int i =1; i<1001; i++) {
		while(count[i]>0) {
			sb.append(i).append('\n');
			count[i]--;
		}
	}
	System.out.println(sb);
	
}
	
}
