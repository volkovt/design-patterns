package cases;

import javax.swing.*;

public class MyFlane extends Sprite {

    @Override
    public void draw() {
        System.out.println("My plane from the bottom of screen: x=" + this.getX() + ",y=" + this.getY());
    }
}
