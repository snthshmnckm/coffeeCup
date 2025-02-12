import java.util.Scanner;

public class FIndPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        if(n<1){
            System.out.println("Invalid input");
            sc.close();
            return ;
        }else{
        System.out.println("Enter the Elements of array: ");
        for(int i = 0 ; i<n;i++){
            arr1[i] = sc.nextInt();
        } 
        for(int i =0;i<n;i++){
            boolean isPrime = true;
            if(arr1[i]<=1) isPrime = false;
            else{
                    for(int j =2 ;j*j<=arr1[i];j++){
                        if(arr1[i]%j==0){
                            isPrime = false;
                            break;
                        }
                    }
            }
            if(isPrime) System.out.print(arr1[i]+ " ");
        }
    }
        sc.close();
    }
}
