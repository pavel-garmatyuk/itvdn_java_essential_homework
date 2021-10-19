package HW_3_Inheritance_and_polymorphism.Task3;

public class Vehicle {
    int x;
    int y;
    int cost;
    int speed;
    int year;

    public Vehicle(int x, int y, int cost, int speed, int year) {
        this.x = x;
        this.y = y;
        this.cost = cost;
        this.speed = speed;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "x=" + x +
                ", y=" + y +
                ", cost=" + cost +
                ", speed=" + speed +
                ", year=" + year +
                '}';
    }
}
