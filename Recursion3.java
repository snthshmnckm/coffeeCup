import java.util.*;
public class Recursion3{
	static void print(int i ,int n){
	if(i <= n){
	System.out.println(i);
		print(i+1, n);
	}
	}
	public static void main(String[] args){
		System.out.print("enter the number ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		print(1,n);			
	}
}
