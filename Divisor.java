import java.util.*;
public class Divisor{
	public static void main(String[] args){
		int n = 12;
		int[] arr = new int[n];
		int count = 0;
		for(int i = 1;i<=n;i++)
		{
			if(n%i == 0) arr[count++] = i;
		}
		System.out.println("Divisors for the "+n+" is "+count);
		for(int i =0;i<count;i++){
			System.out.print(arr[i] + " ");
		}
	}
}
