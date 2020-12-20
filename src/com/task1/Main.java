package com.task1;
//ДЗ 8. Абстрактные классы и интерфейсы
//     1. Написать абстрактный класс Animal с абстрактным методом getName. Сделать несколько классов животных,
//     наследников Animal.
//    Метод getName должен выводит название каждого животного.


 abstract class Animal { // абстрактный класс
     String NameAnimal;

     abstract String getName ();//абстрактный метод
}
class Herbivores extends Animal {

    String getName () {
        return NameAnimal;
    }
    Herbivores (String s){ // конструктор
        NameAnimal =s;
    }

}
class Predators extends Animal {

    String getName () {
        return NameAnimal;
    }
    Predators (String s){ // конструктор
        NameAnimal =s;
    }

}


public class Main {

    public static void main(String[] args) {

        Herbivores Herbiv = new Herbivores (" Кролик ");
        Predators Preda = new Predators (" Лев ");
        System.out.println("Травоядное животное " +Herbiv.getName());
        System.out.println("Хищное животное " +Preda.getName());
    }
}
