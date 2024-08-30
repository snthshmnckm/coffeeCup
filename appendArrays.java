import java.util.*;
class appendArrays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details in below format");
        System.out.println("Fullname|City|Age");
        String details = sc.nextLine();
        String[] tokens = details.split("\\|");
        System.out.println(Arrays.toString(tokens));
        StringBuilder result = new StringBuilder();
        result.append("Name: ").append(tokens[0]).append(System.lineSeparator())
        .append(" City: ").append(tokens[1]).append(System.lineSeparator())
        .append("Age : ").append(tokens[2]);
        System.out.println(result);
    }
}