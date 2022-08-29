package Creational.AbstractFactory;

public class RoadBikeFactory extends BikeFactory{

    @Override
    BikePart create(String type) {
        return switch (type) {
            case "tire" -> new RoadBikeTire();
            case "handlebar" -> new RoadBikeHandlebar();
            default -> null;
        };

    }
}
