package headfirst.designpatterns.various_examples;

public class InterviewQue {
    public static void main(String[] args) {


        //object construction statement
        FinalizeDemo finalizeDemo = new FinalizeDemo();
//        finalizeDemo = null;
//        System.gc();

        Point p1Ref = new Point();
        System.out.println("p1Ref: " + p1Ref);
        //p1Ref: headfirst.designpatterns.various_examples.Point@38082d64

        String str1 = new String("Hello"); //str1 is a ref. var. it has the address of an object
        String str2 = new String("Hello"); //str1 is a ref. var. it has the address of some other object

        //equality operator
        if (str1 == str2) { //Comparing references
            System.out.println("str1 == str2");
        } else {
            System.out.println("str1 ≠ str2");
        } //результат: str1 ≠ str2

        //equals method
        if (str1.equals(str2)) { //Comparing values within the objects
            System.out.println("str1 equals str2");
        } else {
            System.out.println("str1 not equals str2");
        } //результат: str1 equals str2


//        String str = new String("Hello");
//        StringBuilder builder = new StringBuilder("Hello");
//        StringBuffer buffer = new StringBuffer("Hello");

//        str.concat(" Hi ...");
//        builder.append(" Hi ...");
//        buffer.append(" Hi ...");

//        System.out.println(str);
//        System.out.println(builder);
//        System.out.println(buffer);


        int n = 9999;
        long t;

        {
            StringBuffer sb = new StringBuffer();
            t = System.currentTimeMillis();
            for (int i = n; i-- > 0; ) {
                sb.append("");
            }
            System.out.println(System.currentTimeMillis() - t);
        }
        {
            StringBuilder sb = new StringBuilder();
            t = System.currentTimeMillis();
            for (int i = n; i-- > 0; ) {
                sb.append("");
            }
            System.out.println(System.currentTimeMillis() - t);
        }
    }


}

class FinalizeDemo {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object Finalized ...");
    }
}
//Вывод результата: Object Finalized ...

class Point {
    int x;
    int y;

    void showPoint() {
        System.out.println("Point is: " + x + " - " + y);
    }
}
