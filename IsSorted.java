import java.util.*;

public class IsSorted{
	
	static boolean sort(int arr[],int n){
		for(int i = 1;i<n;i++){
			if(arr[i] < arr[i-1]) return false;
		}
		return true;
	}
	public static void main(String[] args){
	int[] arr = {1,2,4,6,7,8,9};
	if(sort(arr,arr.length)) System.out.println("it is sorted");
	else System.out.println("it is not");
	}
}
