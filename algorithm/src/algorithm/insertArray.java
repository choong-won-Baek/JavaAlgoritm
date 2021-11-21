package algorithm;
import java.util.*;
public class insertArray {
public static void main(String[] args) { 
	 int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
	 int n = arr.length;
	 
	 for (int i =0; i< n; i++) { // 배열 처음부터 끝까지 전체르 훓는다  기
		 for(int j = i; j>0; j--){ // 뒤에서기준 까지 훓는
			 if(arr[j]<arr[j-1]) {// 기준까지 훓는면서 앞자리요소가 뒤보다 크면 뒤랑 바꾼
				 int temp = arr[j];
				 arr[j] = arr[j-1];//한칸 씩 뒤 오면 된다 
				 arr[j-1] = temp;
			 }else  break;//앞자리가 뒤보다 작아서 순서대로되면 멈
		 }
	 }
	 for (int i =0; i< n; i++) {
	 System.out.print(arr[i]+" ");
	 }
}
	
}
