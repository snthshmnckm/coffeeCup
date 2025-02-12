import java.util.Arrays;

public class Sort001 {
  static void median(int[] arr, int n) {
    Arrays.sort(arr);
    if (n % 2 != 0) {
      double m = (int) arr[n / 2];
      System.out.println("The median is " + m);
    } else {
      int a = (n/2)-1;
      int b = (n/2);
      System.out.println("The median is " + (double)(arr[a]+arr[b])/2);
    }
  }

  public static void main(String[] args) {
    int[] arr = { 12, 3, 5, 7, 4, 19, 26 };
    int[] arr1 = { 12, 3, 5, 7, 4, 26 };
    System.out.println(arr.length);
    median(arr, arr.length);
    median(arr1, arr1.length);
  }
}
