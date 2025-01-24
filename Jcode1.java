public class Jcode1 {

    public static void main(String[] args) {
        int a = 99;
        if (a>=1 && a<=18 ) {
            System.out.println("Minor");
        }
        else if(a>18 && a<=30) {
        System.out.println("Adult");
        }
        else if(a > 30&&a<=60){
            System.out.println("Boomer");
        }
        else{
            System.out.println("legends");
        }
    }
}