import devcat.Cat;
import devpeople.People;
import impl.DriverBus;

public class Main {

    //static Cat cat = new Cat(); bez constructora
    static Cat cat;
    //static People people = new People(); bez constructora
    static People people;

    public static void main(String [] args) {
        //Bez constructora
        /*cat.setName("Murzik");
        cat.setPoroda("Persidskiy");
        cat.setAge(2);*/

        cat = new Cat(2, "Persidskiy", "Murzik");
        //Bez constructora
        /*people.setName("Vlad");
        people.setLastName("Velychko");
        people.setAge(21);
        people.setCat(cat);*/

        /*people = new People("Vlad", "Velychko", 21, cat);
        people.getCat().setName("Garfield");

        System.out.println(people);
        cat.say();
        people.getCat().say();
        people.sayHello();

        Sportsman sportsman = new Sportsman("Marina", "Kakashka", 20, null);
        sportsman.setTypeSport("Tennis");
        System.out.println(sportsman.getTypeSport());
        System.out.println(sportsman);

        sportsman.sayHello();*/

        DriverBus t = new DriverBus();
        System.out.println(t.getSpeed());
        //t.setCategory("B");
        t.go();
    }
}