package Creational.Builder;

public class Java8Tester{
    public static void main(String[] args) {
        vehicle vehicle = new Car();
        Car c = new Car();
        vehicle.print();
        System.out.println();
        c.print();
    }
}
