import java.util.*;
public class Recursion2{
	static int i = 0;
	static void name(int n){
		if(i == n) return;
		System.out.println("Merunkar");
		i++;
		name(n);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		name(n);
	}
}
