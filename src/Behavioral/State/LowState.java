package Behavioral.State;

public class LowState implements State{

    public LowState(){
        System.out.println("Fan is on low");
    }


    @Override
    public void turnUp(Fan fan) {
        fan.setState(new MediumState());
    }

    @Override
    public void turnDown(Fan fan) {

    }
}
