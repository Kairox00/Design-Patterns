package Behavioral.Mediator;

public class Mediator {
    private Plane plane;
    private PlanesInFlight planesInFlight;
    private PlanesOnGround planesOnGround;
    private Runway runway;

    public Mediator() {
        this.plane = new Plane(123);
        this.planesInFlight = new PlanesInFlight();
        this.planesOnGround = new PlanesOnGround();
        this.runway = new Runway();
    }

    public void takeOff(){
        planesOnGround.removePlane(plane);
        System.out.println("Plane " + plane.getId() + " is taking off...");
        planesInFlight.addPlane(plane);
        plane.setIsInTheAir(true);
        runway.setIsAvailable(true);
    }
}
