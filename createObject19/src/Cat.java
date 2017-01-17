public class Cat {

    int age;
    String poroda;
    String name;
    void say() {
        System.out.println("Meow!");
    }

    @Override
    public String toString() {
        return "Cat [Name: "+name+", Age: "+age+", Poroda: "+poroda+"]";
    }
}