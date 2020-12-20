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





    //    2. Написать интерфейсы Fly, Run и Swim чтобы в каждом было по одному методу.
//    Добавить классам животных из предыдущего задания имплементацию этих интерфейсов. Некоторые животные могут реализовать больше одного интерфейса (утка может и плавать, и летать и бегать).

     //   3. Написать абстрактный класс Человек реализующий интерфейсы «бежать» и «плавать»
     //   (в каждом сделать 1-2 метода). Сделать несколько наследников этого класса с конкретной реализацией методов, которые объявлены в интерфейсах.
public class Main {

    public static void main(String[] args) {

        Herbivores Herbiv = new Herbivores (" Кролик ");
        Predators Preda = new Predators (" Лев ");
        System.out.println("Травоядное животное " +Herbiv.getName());
        System.out.println("Хищное животное " +Preda.getName());
    }
}
