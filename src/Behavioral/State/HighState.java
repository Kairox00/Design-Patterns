package Behavioral.State;

public class HighState implements State{
    public HighState() {
        System.out.println("Fan is on high");
    }

    @Override
    public void turnUp(Fan fan) {

    }

    @Override
    public void turnDown(Fan fan) {
        fan.setState(new MediumState());
    }
}
