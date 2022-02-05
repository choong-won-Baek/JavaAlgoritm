package algorithm;
import java.util.*;

public class inflearn0104 {
	//N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.
	public static ArrayList<String> solution(String[] in) {
		ArrayList<String> answer = new ArrayList<>();
	 
	    /*
		for(int i =0; i<in.length; i++) {
			String temp="";
			for(int j = in[i].length()-1; j >=0; j--) {
				temp +=in[i].charAt(j);
			}
			answer.add(temp);
		}
		*/
		/*
		for(String i : in) {
			String tmp = new StringBuilder(i).reverse().toString();
			answer.add(tmp);
		}
		*/
		for(String i:in) {
			char[] temp = i.toCharArray();
			int lt =0;
			int rt = temp.length-1;
			while(lt<rt) {
				char tmp = temp[lt];
				temp[lt] = temp[rt];
				temp[rt] =tmp;
				lt++;
				rt--;
			}
			String temp2 = String.valueOf(temp);
			answer.add(temp2);
		}
		
		return answer;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	String[] inS = new String[n];
	
	for(int i=0; i<n; i++) {
		inS[i] = sc.next();
		
	}
	
	for(String i : solution(inS)) {
		System.out.println(i);
	}
	
	
	
}
}
