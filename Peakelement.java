public class Peakelement{
    public static void main(String[] args) {
        int [] arr ={4,1,2,3};
        int n = arr.length;
        if(arr[0]>arr[1]) arr[0] = arr[0] + arr[1];
        for(int i = 1;i<n-1;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) arr[i] = arr[i] + arr[i-1]+arr[i+1]; 
        }
        if(arr[n-1]>arr[n-2]) arr[n-1] = arr[n-1] + arr[n-2];
        for(int i = 0;i<n;i++) System.out.print(arr[i]+" ");
    }
}