import java.util.*;
public class Factorial{
	public static void main(String[] args){
		int n = 4;
		int fac =1;
		
		for(int i =n;i>0;i--){
			fac *=i; 
		}
		System.out.printf("%d\n",fac);
	}
}
