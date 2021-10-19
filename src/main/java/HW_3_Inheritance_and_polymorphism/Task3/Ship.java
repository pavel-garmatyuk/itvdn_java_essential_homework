package HW_3_Inheritance_and_polymorphism.Task3;

public class Ship extends Vehicle {
    int passengerCapacity;
    String homePort;

    public Ship(int x, int y, int cost, int speed, int year, int passengerCapacity, String homePort) {
        super(x, y, cost, speed, year);
        this.passengerCapacity = passengerCapacity;
        this.homePort = homePort;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "passengerCapacity=" + passengerCapacity +
                ", homePort='" + homePort + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", cost=" + cost +
                ", speed=" + speed +
                ", year=" + year +
                '}';
    }
}