package algorithm;
import java.util.*;

public class inflearn0402 {
	public static String solution(String a, String b) {
		String answer ="YES";
		HashMap<Character, Integer> map1 = new HashMap<>();
		for(char i : a.toCharArray()) {
			map1.put(i , map1.getOrDefault(i,0)+1);
		}
		HashMap<Character, Integer> map2 = new HashMap<>();
		for(char i : b.toCharArray()) {
			map2.put(i , map2.getOrDefault(i,0)+1);
		}
		for(char i : map1.keySet()) {
			if(map2.containsKey(i)){
			if(map1.get(i) != map2.get(i)) {
				answer = "NO"; 
				break;
			}
			}else { 
				answer = "NO"; 
				break;
			}
		}
		
		
		return answer;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String a = sc.next();
	String b = sc.next();
	
	System.out.println(solution(a,b));
}
	
}
