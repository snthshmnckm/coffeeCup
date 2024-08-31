class Parent3{
	static int i =10;
	static {
	m1();
	System.out.println("Parent Static Block");
	}
	public static void main(String[] args){
		m1();
		System.out.println("P main");
	}
	public static void m1(){
	System.out.println(j);
	}
	static int j = 20;
}
class Child3 extends Parent3{
	static int x = 100;
	static {
	m2();
	System.out.println("Child First Static Block");
	}
	public static void main(String[] args){
	m2();
	System.out.println("C Main");
	}
	public static void m2(){
	System.out.println(y);
	}
	static{
	System.out.println("Child Second Static Block");
	}
	static int y = 200;
}	
