package telran.de.polymorphism.dynamic.interfaces;

public interface DancerInterface {
    void dance();
    default void eat(){
        System.out.println("Кушает с помощью головы");
    }
    default void drink(){
        System.out.println("Пьет воду с помощью головы");
    }

    static int salary = 3;

    static void loveApplause() {
        System.out.println("Кланяются");
    }

}
