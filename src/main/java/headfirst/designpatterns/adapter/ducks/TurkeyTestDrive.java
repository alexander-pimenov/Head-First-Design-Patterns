package headfirst.designpatterns.adapter.ducks;

public class TurkeyTestDrive {
    public static void main(String[] args) {
        //Создаем объект Duck
        MallardDuck duck = new MallardDuck();
        //Создаем объект Turkey
        Turkey duckAdapter = new DuckAdapter(duck);

        //Тестируем методы Turkey.
        for (int i = 0; i < 10; i++) {
            System.out.println("The DuckAdapter says...");
            duckAdapter.gobble();
            duckAdapter.fly();
        }
    }
}
