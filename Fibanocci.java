import java.util.*;
public class Fibanocci{
	public static void main(String[] args){
		int n = 0;
		int k =0,j = 1;
		for(int i = 0;i<5;i++){
			System.out.print(k);
			i = j;
			j = k;
			k = i+j;
		
		}
	}
}
