package algorithm;

public class quickArray { //재귀로 풀기 
	public static void quick(int[] arr, int start, int end) {//재귀적 호출을 위한 함수 사
		if( start >= end) {//배열요소가 하나면 리
			return;
		}
		int pivot = start; //기준 nnnnn
		int left = start+1;// 기준 바로 다
		int right = end;// 배열 
		
		while( left<= right) {//왼쪽이랑 오른쪽이라 겹치지 않으면 계속 ㄱ
			while(left <=end && arr[left] <=arr[pivot]) {//왼쪽이 끝까지 간게 아닌데 기준보다 큰애를 못찾으면
				left++;//찾을때까지 끝으로 이동
			}
			while(right >start&&arr[right]>=arr[pivot]) {//오른쪽이 처음까지 안닿았는데 기준보다 작은 애 목찾았으면
				right--;//처음쪽으로 계속이동
			}
			if(left>right) {// 겹쳐버리면 
				int temp = arr[pivot];//피벗이랑 오른쪽이랑교체
				arr[pivot] = arr[right];
				arr[right] = temp;
			}else {// 왼쪽이랑 오른쪽이랑 안겹치고 조건에 맞는애들 찾았으면 왼쪽 오른쪽 교체
				int temp = arr[left];
				arr[left] =  arr[right];
				arr[right] = temp;
			}
		}
		quick(arr, start, right-1);// 처음부터 오른쪽 앞쪽애랑
		quick(arr,right+1, end);// 오른쪽 뒤쪽애랑 끝까지랑 다시 나누어서 퀵해서 다할때까지 반복
	  }
	
	
 public static void main(String[] args) {
   int[] arr = {5, 7, 9, 0, 3, 1, 6, 2, 4, 8};
   int n = arr.length;
   quick(arr, 0, n-1);//배열이랑 처음 인덱스랑 마지막 인덱스 넣기  
   for (int i=0; i<n; i++) {
	   System.out.print(arr[i]+" ");
   }
 }
}
