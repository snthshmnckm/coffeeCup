import java.util.*;
public class Factorial{
//	public static void main(String[] args){
//		int n = 4;
//		int fac =1;
		
//		for(int i =n;i>0;i--){
//			fac *=i; 
//		}
//		System.out.printf("%d\n",fac);
//	}
static void fact(int i , int n){
	if(i<1){
	System.out.println(n);
	return;
	}
	fact(i-1,n*i);
}	
public static void main(String[] args){
	fact(0,1);
}
}
