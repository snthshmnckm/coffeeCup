import java.util.Arrays;
import java.util.Scanner;
class Tokenizing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the details in the given format:");
        System.out.println("Name|City|Age");
        String details = sc.nextLine();
        String[] tokens = details.split("\\|"); //tokening the string upto encountering /
        System.out.println(Arrays.toString(tokens));
        String name = tokens[0];
        String city = tokens[1];
        String age = tokens[2];
        System.out.println("Name: " + name + ", City: " + city + ", Age: " + age);
    }
}