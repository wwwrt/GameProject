package GameSceneRenderer;
import java.util.ArrayList;

public class CharacterGroup {
    private ArrayList<Character> characters = new ArrayList<>();

    public void addCharacter(Character character) {
        characters.add(character);
    }

    public void moveTo(int newX, int newY, ArrayList<House> houses) {
        int totalSize = characters.stream().mapToInt(Character::getSize).sum();
        if (isValidPosition(newX, newY, totalSize, houses)) {
            characters.forEach(character -> character.moveTo(newX, newY, houses));
        } else {
            System.out.println("Invalid move. Group cannot be placed at (" + newX + "," + newY + ")");
        }
    }

    private boolean isValidPosition(int newX, int newY, int totalSize, ArrayList<House> houses) {
        for (House house : houses) {
            if (newX >= house.getX() && newX < house.getX() + house.getWidth() &&
                    newY >= house.getY() && newY < house.getY() + house.getLength()) {
                return false; // Overlaps with a house
            }
        }
        return newX + totalSize <= 100 && newY + totalSize <= 100; // Assuming board size is 100x100
    }

    public void render() {
        characters.forEach(Character::render);
    }
}
