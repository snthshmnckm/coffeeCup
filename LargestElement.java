import java.util.*;

public class LargestElement{
	static void largest(int arr[] , int n){
		int i = 0,largest = 0;
		if(i<arr.length){
			if(arr[i] > largest) largest = arr[i];
			i++;
		}
		largest(arr,arr.length);
	}
	public static void main(String[] args){
		int[] arr = {2,5,4,3,100};
		System.out.println(largest(arr,arr.length));
	}
	//public static void main(String[] args){
	//	int[] arr = {2,5,4,3,100};
	//	int largest= 0;
	//	for(int i = 0;i<arr.length;i++){
	//		if(arr[i]>largest) largest = arr[i];
	//	}
	//	System.out.println(largest);		

		
	//}
}
