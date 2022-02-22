package cases;

public abstract class Sprite {
    private int x, y; // Coordenadas x, y

    public abstract void draw(); // Desenhe um avião na tela

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
