import java.util.Scanner;
public class Triangle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int i,j,n;
		n = sc.nextInt();
		for(i = 0;i<n;i++){ //0
			for(j = 0;j<n-i-1;j++)//
				System.out.print(" ");
			for(j = 0;j<2*i+1;j++)
				System.out.print("*");
			for(j = 0;j<n-i-1;j++)
				System.out.print(" ");
			System.out.println();
		}
	}
}
