package HW_3_Inheritance_and_polymorphism.Task3;

public class Car extends Vehicle {
    public Car(int x, int y, int cost, int speed, int year) {
        super(x, y, cost, speed, year);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
