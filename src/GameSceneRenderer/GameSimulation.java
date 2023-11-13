package GameSceneRenderer;
import GameSceneRenderer.GameBoard;
import GameSceneRenderer.House;
import GameSceneRenderer.Character;
import GameSceneRenderer.CharacterGroup;

import java.util.ArrayList;

public class GameSimulation {
    public static void main(String[] args) {
        GameBoard gameBoard = new GameBoard();

        if (SceneType.EUROPEAN.equals(SceneType.EUROPEAN)) {
            gameBoard.addHouse(new House("Concrete", 10, 10, 5, 5));
        } else if (SceneType.ASIAN.equals(SceneType.ASIAN)) {
            gameBoard.addHouse(new House("Bamboo", 20, 20, 7, 7));
        } else if (SceneType.AFRICAN.equals(SceneType.AFRICAN)) {
            gameBoard.addHouse(new House("Wail and Cane", 30, 30, 6, 6));
        }

        System.out.println("Initial Game Board:");
        gameBoard.render();

        Character character1 = new Character("Human", 25, 1);
        Character character2 = new Character("Elf", 150, 2);

        CharacterGroup group = new CharacterGroup();
        group.addCharacter(character1);
        group.addCharacter(character2);

        character1.moveTo(5, 5, gameBoard.houses);
        group.moveTo(15, 15, gameBoard.houses);

        System.out.println("\nUpdated Game Board:");
        gameBoard.render();

        System.out.println("\nCharacter and Group Details:");
        character1.render();
        group.render();
    }
}