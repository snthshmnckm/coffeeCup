class Engine{
    public void start(){
        System.out.println("ENGINE STARTED");
    }
}
class Car{
    Engine e;
    Car(Engine e){
        this.e = e;
    }
    public void move(){
        e.start();
        System.out.println("Car is moving");
    }
}
class Testing{
    public static void main(String[] args) {
        Engine e = new Engine();
        Car c = new Car(e);
        c.move();
    }
}