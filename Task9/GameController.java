package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GameController {

    private static GameController instance;

    private List<Player> players;
    private List<GameObject> gameObjects;
    private boolean gameActive;

    private GameController() {
        players = new ArrayList<>();
        gameObjects = new ArrayList<>();
        gameActive = false;
    }

    public static GameController getInstance() {
        if (instance == null) {
            synchronized (GameController.class) {
                if (instance == null) {
                    instance = new GameController();
                }
            }
        }
        return instance;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void removePlayer(Player player) {
        players.remove(player);
    }

    public void addGameObject(GameObject gameObject) {
        gameObjects.add(gameObject);
    }

    public void removeGameObject(GameObject gameObject) {
        gameObjects.remove(gameObject);
    }

    public void startGame() {
        if (!gameActive) {
            gameActive = true;
            initializeGame();
        }
    }

    public void stopGame() {
        if (gameActive) {
            gameActive = false;
            cleanupGame();
        }
    }

    public List<Player> getPlayers() {
        return Collections.unmodifiableList(players);
    }

    public List<GameObject> getGameObjects() {
        return Collections.unmodifiableList(gameObjects);
    }

    public boolean isGameActive() {
        return gameActive;
    }

    private void initializeGame() {
        for (GameObject gameObject : gameObjects) {
            gameObject.initialize();
        }
    }

    private void cleanupGame() {
        for (GameObject gameObject : gameObjects) {
            gameObject.cleanup();
        }
    }
}