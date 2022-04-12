package headfirst.designpatterns.various_examples;

public class MainClass2 {
    public static void main(String[] args) {
        /*Shape s;
        s = new Shape();
        s.draw();*/

        //Runtime Polymorphism
        Shape c;
        c = new Circle(); //polymorphic statement
        c.draw();
        c.showNameClass();

        Shape s;
        s = new Rectangle();
        s.draw();
        s.showNameClass();


        ShapeInt sInt = new Polygon();
        sInt.draw();
    }
}

/*
//обычный класс
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}
*/

//абстрактный класс
abstract class Shape {

    public Shape() {
        System.out.println("Shape is constructed");
    }

    abstract void draw();

    void showNameClass() {
        System.out.println(this.getClass().getSimpleName());
    }
}

interface ShapeInt {
    void draw(); //public abstract void draw()
}

class Circle extends Shape { //object to object inheritance
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape { //object to object inheritance
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

//this is not objects to objects inheritance there
class Polygon implements ShapeInt { //это не наследование объектов от объектов
    public void draw() {
        System.out.println("Drawing a polygon");
    }
}