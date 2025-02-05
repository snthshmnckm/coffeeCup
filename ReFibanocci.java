import java.util.*;
public class ReFibanocci{
	static int fib(int n){
	if(n <= 1) return n;
	int last = fib(n-1);
	int slast = fib(n-2);
	 return last+slast;
	}
	public static void main(String[] args){
		System.out.print(fib(5));
	}
}
