public class CuntDigits {
    public static void main(String[] args) {
        int n = 123456;
        int cunt = 0;
        while(n>0){
            n /=10;
            cunt++;
        }
        System.out.println("Digits in "+n+" are "+cunt);
}
}