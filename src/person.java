package week3.university information.java;

public abstract class Person implements Identifiable {

    private String name;
    private String id;

    // Constructor
    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // Encapsulation: getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getId() {
        return id;
    }

    // Abstract method
    public abstract void displayInfo();
}
