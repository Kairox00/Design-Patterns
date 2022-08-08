package AbstractFactory;

public class MountainBikeFactory extends BikeFactory{
    BikePart create(String type){
        return switch (type) {
            case "tire" -> new MountainBikeTire();
            case "handlebar" -> new MountainBikeHandlebar();
            default -> null;
        };
    }
}
