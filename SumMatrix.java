import java.util.*;

public class SumMatrix {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m, n;
    System.out.println("enter Row and Column: ");
    n = sc.nextInt();
    m = sc.nextInt();
    int mat1[][] = new int[n][m];
    int mat2[][] = new int[n][m];
    int sum[][] = new int[n][m];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        mat1[i][j] = sc.nextInt();
      }
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        mat2[i][j] = sc.nextInt();
      }
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        sum[i][j] = mat1[i][j] + mat2[i][j];
      }
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(sum[i][j] + " ");
      }
      System.out.println();
    }
    sc.close();
  }
}
