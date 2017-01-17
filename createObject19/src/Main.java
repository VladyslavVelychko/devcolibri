public class Main {

    static Cat cat = new Cat();
    static People people = new People();

    public static void main(String [] args) {

        cat.name = "Murzik";
        cat.poroda = "Persidskiy";
        cat.age = 2;

        people.name="Vlad";
        people.lastName="Velychko";
        people.age=21;
        people.cat=cat;

        /*System.out.println(cat.name);
        System.out.println(cat.poroda);
        System.out.println(cat.age);
        System.out.println(cat);*/
        System.out.println(people);
        cat.say();
        people.cat.say();

    }
}
