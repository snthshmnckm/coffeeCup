import java.util.*;
public class ReRevArray{
static void print(int arr[], int n){
	for(int i = 0;i<n;i++){
		System.out.print(arr[i] + " ");
	}
	
}
static void reverse(int arr[],int start,int end){
	int tmp;
	if(start < end){
		tmp = arr[start];
		arr[start] = arr[end];
		arr[end] = tmp;
		reverse(arr,start +1,end -1);
	}
}

public static void main(String args[]){
	int n =5;
	int[] arr = {5,4,3,2,1};
	reverse(arr,0,n-1);
	print(arr,n);
}
}
