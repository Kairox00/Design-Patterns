package Singleton;

public class Tester {
    public static void main(String[] args) {
        Singleton singletonInstance = Singleton.getInstance();
        System.out.println(singletonInstance.getName());
    }
}
