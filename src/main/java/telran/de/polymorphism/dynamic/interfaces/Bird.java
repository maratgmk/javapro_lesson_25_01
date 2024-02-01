package telran.de.polymorphism.dynamic.interfaces;

public class Bird implements DancerInterface{
    @Override
    public void dance() {
        System.out.println("Танцует с помощью крыльев");
    }

    @Override
    public void eat() {
        System.out.println("Кушает с помощью клювика");
    }
    static void loveApplause() {
        System.out.println("Кланяются и машет крылышками");
    }


}
