package Structural.Bridge;

public class Large implements ButtonSize {

    @Override
    public void getSize() {
        System.out.println("setting size to large");
    }
}
