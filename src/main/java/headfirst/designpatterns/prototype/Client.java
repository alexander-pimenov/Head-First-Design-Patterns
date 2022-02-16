package headfirst.designpatterns.prototype;

public class Client {
    public static void main(String[] args) {

        Monster dragon = new Dragon("DraGon", false); // prototype for all Dragons
        Monster drakon = new Drakon("DraKon", 4, true); // prototype for all Dragons

        Monster ladon = makeMonsterOperation(dragon, "Ladon");
        Monster laconian = makeMonsterOperation(drakon, "Laconian");

        System.out.println(ladon);
        ladon.spitPoison();

        System.out.println(laconian);
        laconian.spitPoison();

    }

    public static Monster makeMonsterOperation(Monster monsterToCopy, String name) {
        Monster newMonster = null;
        try {
            newMonster = monsterToCopy.copy();
            newMonster.setName(name);
        } catch (CloneNotSupportedException ex) {
            // TODO Auto-generated catch block
            ex.printStackTrace();
        }
        return newMonster;
    }

//Образец схематичный использования Prototype:
//		Prototype p1 = new ConcretePrototype1();
//		Prototype p2 = new ConcretePrototype2();

    // ... later ...
//		operation(p1);
//		operation(p2);

    /*public static Prototype operation(Prototype p) {
        // This code doesn't know or care what the concrete type of p is
        Prototype pCopy = null;
        try {
            pCopy = p.copy();
            // do something useful with pCopy
            System.out.println("Operating with pCopy!");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return pCopy;
    }*/
}