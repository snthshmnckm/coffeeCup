public class AplaPattern{
	public static void main(String[] args){
		int  n  = 5; 
		//for(int i = 0 ;i<n;i++){
		//	char a = 'A';
		//	for(int j = 0;j<=i;j++){
		//		System.out.print(a);
		//		a++;
		//	}
		//	System.out.println();
		//	}
		for(int i = 0;i<n;i++){
			char a = 'A';
			for(int j=n;j>i;j--){
				System.out.print(a);
				a++;
			}
			System.out.println();
		}
		}
	}
