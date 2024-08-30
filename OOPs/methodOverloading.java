class methodOverloading{
    public static void main(String[] args) {
        System.out.println("PI value is ");
        System.out.println("3.14");
        System.out.println("It is what is ");
        System.out.println(true);
    }
}
class Test{
    public void m1(int i){
        System.out.println("int-args");
    }
    public void m1(float i){
        System.out.println("float-args");
    }
    public static void main(String[] args) {
        Test t = new Test();
        t.m1(10);
        t.m1(10.5f);
        t.m1('a');
        t.m1(10L);
    }
}