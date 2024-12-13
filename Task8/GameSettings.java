package org.example;

class GameSettings {
    private String graphicsQuality;
    private String controlScheme;

    public GameSettings(String graphicsQuality, String controlScheme) {
        this.graphicsQuality = graphicsQuality;
        this.controlScheme = controlScheme;
    }

    public String getGraphicsQuality() {
        return graphicsQuality;
    }

    public void setGraphicsQuality(String graphicsQuality) {
        this.graphicsQuality = graphicsQuality;
    }

    public String getControlScheme() {
        return controlScheme;
    }

    public void setControlScheme(String controlScheme) {
        this.controlScheme = controlScheme;
    }

    public SettingsMemento saveToMemento() {
        return new SettingsMemento(graphicsQuality, controlScheme);
    }

    public void restoreFromMemento(SettingsMemento memento) {
        this.graphicsQuality = memento.getGraphicsQuality();
        this.controlScheme = memento.getControlScheme();
    }

    public static class SettingsMemento {
        private final String graphicsQuality;
        private final String controlScheme;

        private SettingsMemento(String graphicsQuality, String controlScheme) {
            this.graphicsQuality = graphicsQuality;
            this.controlScheme = controlScheme;
        }

        private String getGraphicsQuality() {
            return graphicsQuality;
        }

        private String getControlScheme() {
            return controlScheme;
        }
    }
}
