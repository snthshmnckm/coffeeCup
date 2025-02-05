import java.util.*;

public class SecondLargest{
static int largest(int arr[], int n){	
	int large = Integer.MIN_VALUE;
	int slarge = Integer.MIN_VALUE;
	if(n<2) return -1;
	for(int i =0 ;i<n;i++){
		if(arr[i]>large){ 
			slarge = large;
			large = arr[i];
		}
		else if(arr[i]> slarge && arr[i] != large){
			slarge = arr[i];
			}
	}
	return slarge;
	}
public static void main(String[] args){
	int[] arr = {5,5,5,5,5,5};
	int slarge = largest(arr,arr.length);
	System.out.println("Second largest element : "+ slarge);
}}
