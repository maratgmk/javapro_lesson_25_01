package telran.de.polymorphism.dynamic;

public class BallDancer extends Dancer{

    public BallDancer(String name, int age) {
        super(name, age);
    }

    @Override
    protected void dance() {
        System.out.println(name + " я круто танцую латино в возрасте " + age);
    }
    protected void dance(String nameDance) {
        System.out.println(name + " я круто танцую " + nameDance + " в возрасте " + age);
    }
}
