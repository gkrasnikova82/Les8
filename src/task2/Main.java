package task2;

//    2. Написать интерфейсы Fly, Run и Swim чтобы в каждом было по одному методу.
//    Добавить классам животных из предыдущего задания имплементацию этих интерфейсов.
//    Некоторые животные могут реализовать больше одного интерфейса (утка может и плавать, и летать и бегать).


abstract class Animal { // абстрактный класс
    String NameAnimal;

    abstract String getName ();//абстрактный метод
}
class Herbivores extends Animal implements  Run, Swim {

    String Run;
    String Swim;

    public String getRun () {
        return Run;
    }
    public String getSwim () {
        return Swim;
    }

    public String getName () {
        return NameAnimal;
    }

    Herbivores (String name,  String R, String S){ // конструктор
        NameAnimal =name;
        Run = R;
        Swim = S;
    }
}
class Predators extends Animal implements Fly, Run, Swim{
    String Fly;
    String Run;
    String Swim;

    public String getName () {
        return NameAnimal;
    }
    public String getFly () {
        return Fly;
    }
    public String getRun () {
        return Run;
    }
    public String getSwim () {
        return Swim;
    }
    Predators (String name, String F, String R, String S){ // конструктор
        NameAnimal =name;
        Fly = F;
        Run = R;
        Swim = S;

    }

}
interface Fly {
    abstract String getFly ();
}
interface Run {
     abstract String getRun ();
}
interface Swim {
     abstract String getSwim ();
}

public class Main {

    public static void main(String[] args) {

        Herbivores Herbiv = new Herbivores("Бегемот","бегать", "плавать");
        Predators Preda = new Predators("Аист", "летать","бегаеть","плавать");
        System.out.println("Травоядное животное -" +Herbiv.getName()+ ", умеет: "+Herbiv.getRun()+", "+Herbiv.getSwim()+".");
        System.out.println("Хищное животное -" +Preda.getName()+ ", умеет: "+Preda.getFly()+ ", "+Preda.getRun()+", "+Preda.getSwim()+".");
    }
}




