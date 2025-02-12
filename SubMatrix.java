import java.util.Scanner;

public class SubMatrix {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, m;
    System.out.println("Enter the row and column: ");
    n = sc.nextInt();
    m = sc.nextInt();
    int[][] arr1 = new int[n][m];
    int[][] arr2 = new int[n][m];
    int[][] diff = new int[n][m];
    System.out.println("Enter the matrix1 elements: ");
    for (int i = 0; i < n; i++) {
      System.out.println("Enter the row " + i + " elements: ");
      for (int j = 0; j < m; j++) {
        arr1[i][j] = sc.nextInt();
      }
    }
    System.out.println("Enter the matrix2 elements: ");
    for (int i = 0; i < n; i++) {
      System.out.println("Enter the row " + i + " elements: ");
      for (int j = 0; j < m; j++) {
        arr2[i][j] = sc.nextInt();
      }
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        diff[i][j] = arr1[i][j] - arr2[i][j];
      }
    }
    System.out.println("Difference bw matrix 2 and matrix 1 is ");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(diff[i][j] + " ");
      }
      System.out.println();
    }
    sc.close();
  }
}
