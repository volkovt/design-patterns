package cases;

public class EnemyFlane extends Sprite {

    @Override
    public void draw() {
        System.out.println("Enemy plane from the top of screen: x=" + this.getX() + ",y=" + this.getY());
    }
}
