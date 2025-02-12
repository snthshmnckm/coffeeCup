import java.util.Arrays;

public class Average {
  public static void main(String[] args) {
    int[] arr = { 12, 3, 5, 7, 4, 19, 26 };
    int n = arr.length;
    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum += arr[i];
    }
    int avg = sum / n;
    System.out.println("Average :" + avg);
  }
}
