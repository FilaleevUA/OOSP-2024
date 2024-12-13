package org.example;

public class Main {
    public static void main(String[] args) {
        GameSettings settings = new GameSettings("High", "Keyboard");
        SettingsManager manager = new SettingsManager();

        manager.save(settings);
        settings.setGraphicsQuality("Medium");
        settings.setControlScheme("Controller");

        manager.save(settings);
        settings.setGraphicsQuality("Low");

        manager.undo(settings);
        System.out.println(settings.getGraphicsQuality());
        System.out.println(settings.getControlScheme());

        manager.undo(settings);
        System.out.println(settings.getGraphicsQuality());
        System.out.println(settings.getControlScheme());
    }
}