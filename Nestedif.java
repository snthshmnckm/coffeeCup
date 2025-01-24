import java.util.Scanner;

public class Nestedif {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
       
        char id ='a';
        int pw = 123;

        System.out.println("Enter the user id");
        char b = sc.next().charAt(0);
        if(id == b){
            System.out.println("user corret uh\nPassword sollu");
            int c = sc.nextInt();
            if (pw == c) {
                System.out.println("login aaiko");
            }
            else{
                System.out.println("password thapuda");
            }
        }
        else{
            System.out.println("user id thappu da");
        }
sc.close();
    }

}
