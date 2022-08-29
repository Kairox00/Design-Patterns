package Structural.Bridge;

public class Small implements ButtonSize{
    @Override
    public void getSize() {
        System.out.println("setting size to small");
    }
}
