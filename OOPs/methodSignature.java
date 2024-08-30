class Test{
    public static void m1() {
        System.out.println("no-args");
    }
    public static void m1(int i){
        System.out.println("int-args");
    }
    public static void main(String[] args){
        m1();
        m1(10);
//        m1(11L);
    }
}