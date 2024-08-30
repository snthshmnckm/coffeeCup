abstract class Animal {
    public abstract void eat();
}
class Tiger extends Animal {
    public void eat() {
        System.out.println("meat");
    }
}
class Cow extends Animal {
    public void eat() {
        System.out.println("Grass");
    }
}