import java.util.*;
public class Prime{
	public static void main(String[] args ){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number to check: ");
		int n = in.nextInt();
		int cunt = 0;
		for(int i = 1;i<= Math.sqrt(n);i++){
			if(n%i == 0){
				cunt++;	
				if(i != n/i) cunt++;
			}
		}
		if(cunt == 2) System.out.println("It is a prime number.");
		else System.out.println("It is not a prime number.");
	} 
}
