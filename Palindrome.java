public class Palindrome {
    public static void main(String[] args) {
        int n = 53423;
        int m = n;
        int num = 0;
        while (n!=0) {
            int digit = n%10;
            num = num * 10 + digit;
            n /=10;
        }
        if (num==m) {
            System.out.println("it is palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}
