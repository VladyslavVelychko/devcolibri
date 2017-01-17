public class People {

    String name;
    String lastName;
    int age;

    Cat cat;

    @Override
    public String toString() {
        return "Name: "+name+", Surname: "+lastName+", Age: "+age+", Has a "+cat;
    }
}