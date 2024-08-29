import java.util.Scanner;
class Scan{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String name = sc.nextLine();
	int age = sc.nextInt();
	String city = sc.nextLine();
	System.out.println("Name : "+ name + "\nAge: " +age+"\nCity :"+city);
	}
}
