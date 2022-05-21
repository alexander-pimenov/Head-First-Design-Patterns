package headfirst.designpatterns.adapter.ducks;

/*Итак, чтобы использовать клиента с несовместимым интерфейсом, мы создаем адап-
тер, который выполняет преобразование. Таким образом клиент отделяется от реали-
зованного интерфейса; и если мы ожидаем, что интерфейс будет изменяться со време-
нем, адаптер инкапсулирует эти изменения, чтобы клиента не приходилось изменять
каждый раз, когда ему потребуется работать с новым интерфейсом.*/
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
