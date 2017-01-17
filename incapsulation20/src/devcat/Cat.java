package devcat;

public class Cat extends Animals{

    private int age;
    private String poroda;
    private String name;
    //Constructor
    public Cat(int age, String poroda, String name) {
        this.age = age;
        this.poroda = poroda;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    void eat() {
        System.out.println("Ya poel");
    }

    public void say() {
        System.out.println("Meow!");
    }

    @Override
    public String toString() {
        return "devcat.Cat [Name: "+name+", Age: "+age+", Poroda: "+poroda+"]";
    }
}