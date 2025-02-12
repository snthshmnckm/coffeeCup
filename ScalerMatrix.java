import java.util.*;

public class ScalerMatrix {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num,n,m;
    System.out.println("Enter the scaler: ");
    num = sc.nextInt();
    System.out.println("enter Row and Column: ");
    n = sc.nextInt();
    m = sc.nextInt();
    int mat1[][] = new int[n][m];
    int pro[][] = new int[n][m];
System.out.println("Enter the matrix elements: ");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        mat1[i][j] = sc.nextInt();
      }
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        pro[i][j] = mat1[i][j] * num;
      }
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(pro[i][j] + " ");
      }
      System.out.println();
    }
    sc.close();
  }
}
