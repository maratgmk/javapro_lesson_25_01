package telran.de.polymorphism;

public class SampleOverloading {
    public static void main(String[] args) {
        System.out.println(add(56, -167));
        float resultFloat = add(56.0F, -167);
        System.out.print("это первая строка ");
        System.out.println(" это вторая строка");
        System.out.print(resultFloat);
        System.out.println(" " + add(56));

    }

    public static int add(int arg1, int arg2) {
        int result = arg1 + arg2;
        return result;
    }

    public static float add(float arg1, int arg2) {
        float result = arg1 + arg2;
        return result;
    }

    public static int add(int arg1) {
        int result = arg1 + arg1;
        return result;
    }
}
