package GameSceneRenderer;
public class House {
    private String material;
    private int x, y, width, length;

    public House(String material, int x, int y, int width, int length) {
        this.material = material;
        this.x = x;
        this.y = y;
        this.width = width;
        this.length = length;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public String getMaterial() {
        return material;
    }
}
