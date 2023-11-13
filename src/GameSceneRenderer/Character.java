package GameSceneRenderer;
import java.util.ArrayList;

public class Character {
    private String type;
    private int age, x, y, size;

    public Character(String type, int age, int size) {
        this.type = type;
        this.age = age;
        this.size = size;
        this.x = 0;
        this.y = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSize() {
        return size;
    }

    public void moveTo(int newX, int newY, ArrayList<House> houses) {
        if (isValidPosition(newX, newY, houses)) {
            this.x = newX;
            this.y = newY;
            System.out.println("Character moved to (" + x + "," + y + ")");
        } else {
            System.out.println("Invalid move. Character cannot be placed at (" + newX + "," + newY + ")");
        }
    }

    private boolean isValidPosition(int newX, int newY, ArrayList<House> houses) {
        for (House house : houses) {
            if (newX >= house.getX() && newX < house.getX() + house.getWidth() &&
                    newY >= house.getY() && newY < house.getY() + house.getLength()) {
                return false; // Overlaps with a house
            }
        }
        return true;
    }

    public void render() {
        System.out.println("Character type: " + type + ", Age: " + age + ", Position: (" + x + "," + y + "), Size: " + size);
    }
}
