package GameSceneRenderer;
import java.util.ArrayList;

public class GameBoard {
    ArrayList<House> houses = new ArrayList<>();

    public void addHouse(House house) {
        houses.add(house);
    }

    public void render() {
        houses.forEach(house -> System.out.println("House Material: " + house.getMaterial() +
                ", Position: (" + house.getX() + "," + house.getY() + "), Size: (" + house.getWidth() + "x" + house.getLength() + ")"));
    }
}