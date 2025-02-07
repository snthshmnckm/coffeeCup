import java.util.*;
public class BinarySea {
    public static void main(String[] args) {
        int [] arr = {1,6,8,3,5,27,9,25,6,4,32,34};
        Arrays.sort(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int k = 32; 
        System.out.print(Arrays.binarySearch(arr,k));
    }
}
