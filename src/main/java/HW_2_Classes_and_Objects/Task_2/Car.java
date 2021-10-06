package HW_2_Classes_and_Objects.Task_2;

public class Car {
    private int year;
    private String color;

    public Car(String pantone) {
        this.year = 2000;
        this.color = "white";
    }

    public Car(int year, String color) {
        this.year = year;
        this.color = color;
    }

    public Car() {

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
