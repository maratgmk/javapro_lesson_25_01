package telran.de.polymorphism.dynamic;

public class SampleOverriding {
    public static void main(String[] args) {
        Dancer.loveApplause();
        System.out.println("За выход на сцену " + Dancer.salary);
        Dancer dancer = new Dancer("Green",48);
        Dancer dancerActor = dancer;
        dancerActor.dance();

        dancerActor  = new BallDancer("White",37);
        dancerActor.dance();

        dancerActor = new FolkDancer("Red", 65);
        dancerActor.dance();
        FolkDancer.loveApplause();
        System.out.println("За выход на сцену " + FolkDancer.salary);

        dancerActor = new BallDancer("Yellow", 27);
        dancerActor.dance();
        dancer.dance();

        BallDancer ballDancer = new BallDancer("Red",57);
        ballDancer.dance();
        ballDancer.dance("Pasdoble");


    }
}
