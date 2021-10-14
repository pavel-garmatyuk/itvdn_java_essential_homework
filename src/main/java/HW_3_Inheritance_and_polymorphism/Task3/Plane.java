package HW_3_Inheritance_and_polymorphism.Task3;

public class Plane extends Vehicle {
    int height;
    int passengerCapacity;

    public Plane(int x, int y, int cost, int speed, int year, int height, int passengerCapacity) {
        super(x, y, cost, speed, year);
        this.height = height;
        this.passengerCapacity = passengerCapacity;
    }
}
