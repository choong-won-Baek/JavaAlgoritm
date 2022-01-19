package algorithm;
import java.util.*;

public class inflearn0401 {
	public static char solution(int n, String s) {
		int max=0;
		char answer=' ';
		HashMap<Character, Integer> map = new HashMap<>();
		for(char i : s.toCharArray()) {
		   map.put(i, map.getOrDefault(i,0)+1);
		}
	/*	for(char i: map.keySet()) { 해쉬 맵 전체 출
			System.out.println(i+" "+map.get(i));
		}
		
		System.out.println(map.containsKey('A'); 키의 유물를 알려
		System.out.println(map.size());키의 갯수를 알려
	    System.out.println(map.remove('A'); 특정 키 삭제 
		*/
		
		for(char i : map.keySet()) {
		   if(map.get(i)>max) {
			   answer =i; 
		   max = map.get(i);
		   }
		}
		return answer;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	String s = sc.next();
	System.out.println(solution(n,s));
}
}
