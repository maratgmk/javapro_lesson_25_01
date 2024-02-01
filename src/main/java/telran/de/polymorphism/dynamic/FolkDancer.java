package telran.de.polymorphism.dynamic;

public class FolkDancer extends Dancer{
    public FolkDancer(String name, int age) {
        super(name, age);
    }

    @Override
    public void dance() {
        System.out.println(name + " я круто танцую Краковяк в возрасте " + age);
    }
}
