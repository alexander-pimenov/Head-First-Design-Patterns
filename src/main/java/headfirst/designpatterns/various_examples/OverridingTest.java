package headfirst.designpatterns.various_examples;

public class OverridingTest {
    public static void main(String[] args) {
        Car b = new Audi(); //upcasting
        b.run();
    }
}
class Car{
    public Car() {
        System.out.println("Car object is created");
    }

    void run(){
        System.out.println("Car is running");
    }
}
class Audi extends Car{

    public Audi() {
        System.out.println("Audi object is created");
    }

    void run(){
        System.out.println("Audi is running safely with 100km");
    }
}
//output
//Car object is created
//Audi object is created
//Audi is running safely with 100km