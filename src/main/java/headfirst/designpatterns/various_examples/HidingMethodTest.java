package headfirst.designpatterns.various_examples;

public class HidingMethodTest {
    public static void main(String[] args) {
        Base base = new Derived();
        base.print();
        //base.display(); //приватный метод, закрыт для внешних классов
        base.show(); //вызван статический метод класса Base
        Base.show();
        Derived.show();
    }
}
class Base {
    public Base() {
        System.out.println("Base object is created");
    }
    private static void display() {
        System.out.println("Static or class method from Base");
    }
    public static void show() {
        System.out.println("Static or class method show() from Base");
    }
    public void print() {
        System.out.println("Non-static or Instance method Base");
    }
}
class Derived extends Base {
    public Derived() {
        System.out.println("Derived object is created");
    }
    private static void display() {
        System.out.println("Static or class method from Derived");
    }
    public static void show() {
        System.out.println("Static or class method show() from Derived");
    }
    public void print() {
        System.out.println("Non-static or Instance method Derived");
    }
}
//output
//Base object is created
//Derived object is created
//Non-static or Instance method Derived
//Static or class method show() from Base
//Static or class method show() from Base
//Static or class method show() from Derived