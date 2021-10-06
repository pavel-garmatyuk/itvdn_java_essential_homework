package HW_2_Classes_and_Objects.Task_3;

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;

    Car() {}

    public Car(int year) {
        this.year = year;
    }

    public Car(int year, String color) {
        this(year);
        this.color = color;
    }

    public Car(int year, double speed, int weight) {
        this(year);
        this.speed = speed;
        this.weight = weight;
    }

    public Car(int year, double speed, int weight, String color) {
        this(year, speed, weight);
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public double getSpeed() {
        return speed;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
