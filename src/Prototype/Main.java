package Prototype;

public class Main {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.setOwner("Sue");
        Rabbit rabbitCopy = rabbit.clone();
        System.out.println("Age of first rabbit: "+rabbit.getOwner());
        System.out.println("Age of second rabbit: "+rabbitCopy.getOwner());


    }
}
