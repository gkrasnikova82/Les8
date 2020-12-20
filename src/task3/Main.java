package task3;
//   3. Написать абстрактный класс Человек реализующий интерфейсы «бежать» и «плавать»
//   (в каждом сделать 1-2 метода). Сделать несколько наследников этого класса с конкретной реализацией методов,
//   которые объявлены в интерфейсах.



abstract class Person implements Run, Swim {// абстрактный касс
         abstract String getName ();// метод
}

interface Run {  // интерфейс1
    abstract String getRun ();
    abstract String getShoes ();
}
interface Swim {  // интерфейс2
    abstract String getSwim ();
}

class Male extends Person { //класс мужчины
    String Name;
    String Run;
    String Swim;
    String Shoes;

    public String getName () { // метод получения имени
        return Name;
    }

    Male (String name,  String R, String S, String H){ // конструктор
        Name =name;
        Run = R;
        Swim = S;
        Shoes = H;
    }

    public String getRun () {
        return Run;
    }
    public String getSwim () {
        return Swim;
    }
    public String getShoes () {
        return Shoes;
    }
}
class Woman extends Person {
    String Name;
    String Run;
    String Swim;
    String Shoes;

    public String getName () {
        return Name;
    }

    Woman (String name,  String R, String S, String H){ // конструктор
        Name =name;
        Run = R;
        Swim = S;
        Shoes = H;
    }

    public String getRun () {
      if (Shoes.startsWith("туф")) Run ="не бежит";
      return Run;
    }
    public String getSwim () {
        return Swim;
    }
    public String getShoes () {
        return Shoes;

    }
}



public class Main {

    public static void main(String[] args) {

        Male Male1 = new Male("Саша","бегает", "умеет плавать","кедах");
        Woman Woman1 = new Woman("Инесса", "бежит","умеет плавать","туфлях");
        System.out.println(Male1.getName()+ ", "+Male1.getRun()+" в "+Male1.getShoes()+", "+Male1.getSwim()+".");
        System.out.println(Woman1.getName()+ ", "+Woman1.getRun()+" в "+Woman1.getShoes()+", "+Woman1.getSwim()+".");
    }
}
