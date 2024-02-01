package telran.de.polymorphism.dynamic.interfaces;

public class Dog implements DancerInterface{
    @Override
    public void dance() {
        System.out.println("Собачка танцует на задних лапках");
    }


}
