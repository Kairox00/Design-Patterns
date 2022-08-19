package Bridge;

import java.awt.*;

public class Large implements ButtonSize {

    @Override
    public void getSize() {
        System.out.println("setting size to large");
    }
}
