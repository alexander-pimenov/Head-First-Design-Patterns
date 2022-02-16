package headfirst.designpatterns.strategy;

import java.util.ArrayList;

public class AnimalTest {

    public static void main(String[] args) {
        AnimalTest at = new AnimalTest();
        at.makeSomeAnimals();
    }

    public void makeSomeAnimals() {
        Animal dog = new Dog(); //наблюдаем полиморфное использование ссылки Animal==Dog
        Animal cat = new Cat(); //наблюдаем полиморфное использование ссылки Animal==Cat
        Animal bird = new Bird(); //наблюдаем полиморфное использование ссылки Animal==Bird
        // treat dogs and cats and birds as their supertype, Animal
        // относитесь к собакам, кошкам и птицам как к их супертипу Animal
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(dog);
        animals.add(cat);
        animals.add(bird);

        animals.forEach(Animal::makeSound); // can call makeSound on any Animal
    }

    public abstract class Animal {
        abstract void makeSound();
    }

    public class Dog extends Animal {
        void makeSound() {
            bark();
        }

        void bark() {
            System.out.println("Woof-woof");
        }
    }

    public class Cat extends Animal {
        void makeSound() {
            meow();
        }

        void meow() {
            System.out.println("Meow");
        }
    }

    public class Bird extends Animal {

        @Override
        void makeSound() {
            chirick();
        }

        private void chirick() {
            System.out.println("Chirick-chick-chick");
        }
    }
}
