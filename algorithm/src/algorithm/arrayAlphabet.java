package algorithm;
import java.util.*;
/*
 * 알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.

길이가 짧은 것부터
길이가 같으면 사전 순으로
 */
public class arrayAlphabet {
  public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);
	   int roof = in.nextInt();
	   String[] word = new String[roof];
	   for(int i=0; i<roof; i++) {
		   word[i] = in.next();
	   }
	   
	   Arrays.sort(word);
		 Arrays.sort(word, Comparator.comparing(String::length));
		 
	 ArrayList<String> result = new ArrayList<>();
	 for(String item:word) {
		 if(!result.contains(item))
			 result.add(item);
	 }
	   
	   /*
	HashSet<String> hashSet = new HashSet<>(Arrays.asList(word));
	String[] result = hashSet.toArray(new String[0]);
	*/
	
	
	for(String a : result) {
		System.out.println(a);
	}
	  
  }
	
}
