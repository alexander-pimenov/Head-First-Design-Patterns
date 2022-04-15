package headfirst.designpatterns.various_examples;

public class InitializationBlocksTest {
    public static void main(String[] args) {
//        B b = new B();
//        System.out.println(b.i);

        C c = new C();
        System.out.println(c.i);

    }
}

class B {
    static int i = 100;

    static {
        //расписал блок для понятности
        int a = i--;
        System.out.println(a);
        int b = --i;
        System.out.println(b);
        i = a - b;
        //------------------------------

//        i = i-- - --i;
        System.out.println("First " + i);
    }

    {
        //расписал блок для понятности
        int a = i++;
        System.out.println(a);
        int b = ++i;
        System.out.println(b);
        i = a + b;
        //------------------------------

//        i = i++ + ++i;
        System.out.println("Second :" + i);
    }

    public B() {
        System.out.println("The constructor B is being executed");
    }
}

class C extends B {
    static {
        //расписал блок для понятности
        int a = --i;
        System.out.println(a);
        int b = i--;
        System.out.println(b);
        i = a - b;
        //------------------------------

//        i = --i - i--;
        System.out.println("Third " + i);
    }

    {
        //расписал блок для понятности
        int a = ++i;
        System.out.println(a);
        int b = i++;
        System.out.println(b);
        i = a + b;
        //------------------------------

//        i = ++i + i++;
        System.out.println("Fourth :" + i);
    }

    public C() {
        System.out.println("The constructor C is being executed");
    }
}
//output
//First 2
//Third 0
//Second :2
//Fourth :6
//6

//full output
//100
//98
//First 2
//1
//1
//Third 0
//0
//2
//Second :2
//3
//3
//Fourth :6
//6