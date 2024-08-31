class A1{
	public void m1(int... a){
	System.out.println("Parent");
	}}
class B1 extends A1{
	public void m1(int a){
	System.out.println("Child");
	}
	}
class VarArg2{
	public static void main(String[] args){
	A1 a = new A1();
	a.m1(10);
	B1 b = new B1();
	b.m1(10);
	A1 a2 = new B1();
	a2.m1(10);
	}
}

