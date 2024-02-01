package telran.de.polymorphism.dynamic;

public class BreakDancer extends Dancer{
    public BreakDancer(String name, int age) {
        super(name, age);
    }

    @Override
    protected void dance() {
        System.out.println(name + " я круто танцую BreakDance в возрасте " + age);
    }
}
