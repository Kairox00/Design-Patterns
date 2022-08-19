package Bridge;

import java.awt.*;

public class Small implements ButtonSize{
    @Override
    public void getSize() {
        System.out.println("setting size to small");
    }
}
