package Creational.AbstractFactory;

public class FactoryCreator {
    public static BikeFactory createFactory(String type){
        return switch (type){
            case "mountain bike" -> new MountainBikeFactory();
            case "road bike" -> new RoadBikeFactory();
            default -> null;
        };
    }
}
