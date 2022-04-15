package headfirst.designpatterns.various_examples;

public class MultipleConstructorsTest {
    public static void main(String[] args) {
        A obj = new A();
    }
}

class A {
    public A() {
        this(0);
        System.out.println("Hi");
    }

    public A(int x) {
        this(0, 0);
        System.out.println("Hello");
    }

    public A(int x, int y) {
        System.out.println("How are you?");
    }
}
//output
//How are you?
//Hello
//Hi