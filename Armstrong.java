import java.lang.Math;
public class Armstrong{
	public static void main(String[] args){
		int num = 232;
		int n = num;
		int sum = 0;
		int k = String.valueOf(num).length();
		while(num > 0){
			int digit = num%10;
			sum += Math.pow(digit,k);
			num /=10;
		}
		if(sum == n) System.out.println("It is armstrong number");
		else System.out.println("athu illada");
	}
}
