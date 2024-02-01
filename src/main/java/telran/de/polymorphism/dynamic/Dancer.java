package telran.de.polymorphism.dynamic;

public class Dancer {
    protected String name;
    protected int age;

    public Dancer(String name, int age) {
        this.name = name;
        this.age = age;
    }
    protected void dance() {
        System.out.println(name + " я танцую как все в возрасте " + age);
    }
    static int salary = 3;

    static void loveApplause() {
        System.out.println("Кланяются");
    }
}
