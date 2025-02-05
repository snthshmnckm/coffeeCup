import java.util.*;
public class Sumrecursion{
static void sum(int i,int n){
	if(i<1){
	System.out.println(n);
	return ;
	}
	sum(i-1,n+i);
	
}
public static void main(String[] args){
	System.out.print("Enter the number: ");
	Scanner sc = new Scanner (System.in);
	int n = sc.nextInt();
	sum(n,0);
	
}
}
