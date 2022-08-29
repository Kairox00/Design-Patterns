package Structural.Facade;

public class Car {


  public static void main(String[] args) {
    DrivingFacade facade = new DrivingFacade();
    facade.drive();
  }

}
