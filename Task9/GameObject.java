package org.example;

class GameObject {
    private String id;

    public GameObject(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void initialize() {
        System.out.println("Initializing GameObject: " + id);
    }

    public void cleanup() {
        System.out.println("Cleaning up GameObject: " + id);
    }

    @Override
    public String toString() {
        return id;
    }
}
