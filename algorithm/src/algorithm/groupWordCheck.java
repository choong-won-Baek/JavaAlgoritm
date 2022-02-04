package algorithm;
import java.util.*;
public class groupWordCheck {
	/*
	 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.

단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오

	 */
public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int roof = sc.nextInt();
  int answer = roof;
  for(int i = 0; i<roof; i++) {
	  String word = sc.next();
	  boolean[] alpha = new boolean[26];
	  
	  for(int j =1; j<word.length(); j++) {
		  if(word.charAt(j-1)!=word.charAt(j)) {
			  if(alpha[word.charAt(j)-97] == true) {
				  answer--;
				  break;
			  }
			  alpha[word.charAt(j-1)-97] = true;
		  }
		  
	  }
  }
  System.out.println(answer);
  
}
	
}
