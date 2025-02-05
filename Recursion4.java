import java.util.Scanner;
public class Recursion4{
	static void print(int i,int n){
		if(i<=n){
		System.out.print(n);
		print(i,--n);
		}
	}
	public static void main(String[] args){
	System.out.println("Number podra :");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i = 1;
	print(i,n);
}
}
