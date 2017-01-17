package devcat;

import devpeople.People;

public class Sportsman extends People {

    private String typeSport;

    public Sportsman(String name, String lastName, int age, Cat cat) {
        super(name, lastName, age, cat);
    }

    public String getTypeSport() {
        return typeSport;
    }

    public void setTypeSport(String typeSport) {
        this.typeSport = typeSport;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello, Vladyslav");
    }
}