package telran.de.polymorphism.dynamic.interfaces;

public class SampleZoo {
    public static void main(String[] args) {
        DancerInterface.loveApplause();
        System.out.println();
        DancerInterface actor = new Dog();
        actor.dance();
        actor.eat();
        actor.drink();
        System.out.println();
        actor = new Bird();
        actor.dance();
        actor.eat();
        actor.drink();
        Bird.loveApplause();
        System.out.println();
        actor = new Fish();
        actor.dance();
        actor.eat();
        actor.drink();
        System.out.println("===== Aplause!!! ====");
        DancerInterface.loveApplause();
        System.out.println("Содержание актера = " + DancerInterface.salary);


    }
}
