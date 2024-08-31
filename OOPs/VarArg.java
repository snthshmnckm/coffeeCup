class VarArg{
	public static void m1(int... a){
	int sum =0;
	for(int x : a){
	sum = sum +x;
	}
	System.out.println(sum);
	}
	public static void main(String[] args)
	{
		m1(10);
		m1(10,20);
		m1(10,20,30);
		m1();
		m1(new int[]{10,20,30,40});
	}
}
