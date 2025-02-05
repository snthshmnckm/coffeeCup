public class AlphaIpyramid{
	public static void main(String[] args){
	int n = 5;
	int a = 'A' + (n-1);
	for(int i = 0;i<n;i++){
		int b =a-i;
		for(int j = 0 ;j<=i;j++){
			System.out.printf("%c",b);
			b++;
		}
		System.out.println();
	}
	}
}
