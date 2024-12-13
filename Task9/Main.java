package org.example;

public class Main {
    public static void main(String[] args) {
        GameController controller = GameController.getInstance();

        Player player1 = new Player("Player1");
        Player player2 = new Player("Player2");

        GameObject object1 = new GameObject("Object1");
        GameObject object2 = new GameObject("Object2");

        controller.addPlayer(player1);
        controller.addPlayer(player2);

        controller.addGameObject(object1);
        controller.addGameObject(object2);

        controller.startGame();

        System.out.println("Game active: " + controller.isGameActive());
        System.out.println("Players: " + controller.getPlayers());
        System.out.println("Game Objects: " + controller.getGameObjects());

        controller.stopGame();
        System.out.println("Game active: " + controller.isGameActive());
    }
}