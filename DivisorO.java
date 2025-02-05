import java.util.ArrayList;
public class DivisorO {
	public static void main(String[] args){
	ArrayList<Integer> al = new ArrayList<>();
	int n = 12;
	int sq = (int) Math.sqrt(n);
	for(int i = 1 ; i <= sq;i++){
		if(n%i==0){ al.add(i);
			if(i != n/i) al.add(n/i);
		}
	}
	System.out.print("Divisors for "+n+" is ");
	for(int i : al){
	System.out.print(i+" ");
	}}
}
