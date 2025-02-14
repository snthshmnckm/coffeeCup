public class EqualMatrix{
    public static void main(String[] args) {
        boolean isEqual = true;
        int [][] mat1 = {{1,0},{0,1}};
        int [][] mat2 = {{1,0},{1,1}};
        int m = 2;
        int n  =2;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(mat1[i][j]!=mat2[i][j]){
                     isEqual = false;
                     break;
                }
            }
            if(!isEqual) break;
        }
        if(isEqual) System.out.println("Equal matrix.");
        else System.out.println("not equal");
    }
}