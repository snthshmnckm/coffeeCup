public class Recursion1{
	static int n = 0;
	static void cunt(){
		if(n == 3) return;
		System.out.println(n);
		n++ ;
		cunt();

	} 


	public static void main(String[] args){
		cunt();
	}
}
