package main;

public class Main {

    public static void main(String[] args) {
        EagerSingleton eagerSingletonInstance = EagerSingleton.getSingleton();

        System.out.println("Eager Singleton : " + eagerSingletonInstance);

        LazySingleton lazySingletonInstance = LazySingleton.getInstance();

        System.out.println("Lazy Singleton : " + lazySingletonInstance);
    }
}
