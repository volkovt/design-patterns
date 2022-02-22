import cases.EnemyFlane;
import cases.MyFlane;
import cases.Sprite;

public class TestSprite {
    public static void main(String[] args) {
        Sprite mySprite = new MyFlane();
        mySprite.setX(100);
        mySprite.setY(300);
        mySprite.draw();

        Sprite enemySprite = new EnemyFlane();
        enemySprite.setX(0);
        enemySprite.setY(300);
        enemySprite.draw();
    }
}
