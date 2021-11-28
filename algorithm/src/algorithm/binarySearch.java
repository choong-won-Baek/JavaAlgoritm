package algorithm;
import java.util.*;
public class binarySearch {
public static int binary(int[] arr, int target, int start, int end) {
	while(start<=end) {
		int mid = (start+end)/2;
		if (arr[mid]==target) return mid;
		else if(arr[mid]>target) end = mid-1;
		else start = mid+1;
	}
	return -1;
}
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	int count =0;
	count = scanner.nextInt();
	int[] arr = new int[count];
	int target=0;

	
	for(int i=0;i<count;i++) {
		arr[i]=scanner.nextInt();
	}
	target=scanner.nextInt();
	System.out.print(binary(arr,target, 0, count-1));
    

}
}
