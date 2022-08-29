package Behavioral.State;

public class MediumState implements State{
    public MediumState() {
        System.out.println("Fan is on medium");
    }

    @Override
    public void turnUp(Fan fan) {
        fan.setState(new HighState());
    }

    @Override
    public void turnDown(Fan fan) {
        fan.setState(new LowState());
    }
}
