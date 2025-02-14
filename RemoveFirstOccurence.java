public class RemoveFirstOccurence{
    public static void main(String[] args) {
        int[] arr = {1,2,5,3,2,6,4,7} ;
        int tar = 5;
        int found = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == tar){
                found = 1;
                for(int j = i;j<arr.length-1;j++){
                    arr[j] = arr[j+1];

                }
            } 
        }
        if(!found) System.out.println("The element not found");
    }
}