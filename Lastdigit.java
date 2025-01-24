import java.util.*;
public class Lastdigit{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		double c =(Math.pow(a,b))%10;
		int y = (int)c;
		System.out.println(y);
	}
}
