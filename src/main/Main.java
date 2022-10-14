package main;

public class Main {

    public static void main(String[] args) {
        EagerSingleton singletonInstance = EagerSingleton.getSingleton();

        System.out.println(singletonInstance);
    }
}
