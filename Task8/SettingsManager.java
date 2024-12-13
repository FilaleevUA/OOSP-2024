package org.example;

import java.util.Stack;

class SettingsManager {
    private final Stack<GameSettings.SettingsMemento> history = new Stack<>();

    public void save(GameSettings settings) {
        history.push(settings.saveToMemento());
    }

    public void undo(GameSettings settings) {
        if (!history.isEmpty()) {
            settings.restoreFromMemento(history.pop());
        }
    }
}
