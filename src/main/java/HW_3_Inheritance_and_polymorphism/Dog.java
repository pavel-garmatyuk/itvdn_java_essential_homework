package HW_3_Inheritance_and_polymorphism;

public class Dog extends  HomeAnimal {
    public Dog() {
    }

    public Dog(String name, String animalType, String sound) {

        super(name, animalType, sound);
        name = "Bobik";
        animalType = "Dog";
        sound = "Gav-Gav";

    }
}