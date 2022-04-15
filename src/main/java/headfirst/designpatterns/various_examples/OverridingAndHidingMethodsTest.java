package headfirst.designpatterns.various_examples;

public class OverridingAndHidingMethodsTest {
    public static void main(String[] args) {
    Parent parent = new Child();
    Child child = new Child();

    parent.foo(); //I am foo in Super
    child.foo(); //I am foo in Child

    parent.bar(); //I am bar in Child
    child.bar(); //I am bar in Child
    }
}
class Parent{
    public Parent() {
        System.out.println("A Parent has been created");
    }

    public static void foo(){
        System.out.println("I am foo in Super");
    }
    public void bar(){
        System.out.println("I am bar in Super");
    }
}

class Child extends Parent{
    public Child() {
        System.out.println("A Child has been created");
    }

    public static void foo(){
        System.out.println("I am foo in Child");
    }

    @Override
    public void bar() {
        System.out.println("I am bar in Child");
    }
}
//output
//A Parent has been created
//A Child has been created
//A Parent has been created
//A Child has been created
//I am foo in Super
//I am foo in Child
//I am bar in Child
//I am bar in Child