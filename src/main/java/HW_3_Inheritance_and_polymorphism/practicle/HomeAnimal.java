package HW_3_Inheritance_and_polymorphism.practicle;

public class HomeAnimal {
    private String name;
    private String sound;
    private String animalType;

    public HomeAnimal() {
    }

    public HomeAnimal(String name) {
        this.name = name;
    }

    public HomeAnimal(String name, String animalType, String sound) {
        this(name);
        this.animalType = animalType;
        this.sound = sound;
    }
    void sound() {
    }

    void show() {

    }

}
