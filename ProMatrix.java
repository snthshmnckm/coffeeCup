import java.util.Scanner;
public class ProMatrix{
    public static void main(String[] args) {
    Scanner sc  = new Scanner (System.in);  
    System.out.println("Enter the matrix 1 dimension: ");
    int n,m ;
    n = sc.nextInt();
    m = sc.nextInt();
    System.out.println("Enter the matrix 2 dimension: ");
    int p,q ;
    p = sc.nextInt();
    q = sc.nextInt();
    if(m != p){
        System.out.println("Matrix cannot be multiplied.");
        sc.close();
        return ;
    }
    int [][] mat1 = new int[n][m];    
    int [][] mat2 = new int[p][q];    
    int [][] pro = new int[n][q];    
    for(int i = 0;i<n;i++){
        for(int j = 0;j<q;j++){
            pro[i][j] = 0;
        }
    }
    System.out.println("Elements for matrix 1:");

    for(int i = 0;i<n;i++){
        for(int j = 0;j<m;j++){
            mat1[i][j] = sc.nextInt();
        }
    }
    System.out.println("Elements for matrix 2:");

    for(int i = 0;i<p;i++){
        for(int j = 0;j<q;j++){
            mat2[i][j] = sc.nextInt();
        }
    }
    for(int i = 0;i<n;i++){
        for(int j = 0;j<q;j++){
            for(int k = 0;k<m;k++){
                pro[i][j] += mat1[i][k] * mat2[k][j];
            }
        }
    }
    System.out.println("Product:");
    for(int i = 0;i<n;i++){
        for(int j = 0;j<q;j++){
            System.out.print(pro[i][j]+ " ");
        }
        System.out.println();
    }
    sc.close();
}
}