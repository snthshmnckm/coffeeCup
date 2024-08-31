class StaticControlFlow{ 
	static int i =10;
	static {
	m1();
	System.out.println("Parent First Static Block");
	}
	public static void main(String[] args){
	m1();
	System.out.println("P main");
	}
	public static void m1(){
	System.out.println(j);
	}
	static {
	System.out.println("Parent Second Static Block");
	}
	static int j = 20;
}

