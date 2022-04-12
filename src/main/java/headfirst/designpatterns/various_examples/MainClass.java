package headfirst.designpatterns.various_examples;

public class MainClass {
    public static void main(String[] args) {
        System.out.println(methodOne(3));
    }

    static int methodOne(int i) {
        return methodTwo(i *= 11);
    }

    private static int methodTwo(int i) {
        return methodThree(i /= 11);
    }

    private static int methodThree(int i) {
        return methodFour(i -= 11);
    }

    private static int methodFour(int i) {
        return i += 11;
    }
}
