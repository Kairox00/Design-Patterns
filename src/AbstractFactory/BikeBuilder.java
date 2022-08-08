package AbstractFactory;

public class BikeBuilder {
    public static void createBike(String type){
        BikeFactory factory = FactoryCreator.createFactory(type);
        Tire tireFront = (Tire) factory.create("tire");
        Tire tireBack = (Tire) factory.create("tire");
        Handlebar handlebar = (Handlebar) factory.create("handlebar");
        tireFront.getDescription();
        tireBack.getDescription();
        handlebar.getDescription();
    }

    public static void main(String[] args) {
        BikeBuilder.createBike("road bike");
        BikeBuilder.createBike("mountain bike");
    }
}
