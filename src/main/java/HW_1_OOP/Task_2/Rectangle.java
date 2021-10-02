package HW_1_OOP.Task_2;

public class Rectangle {
    private double side1;
    private double side2;

    protected double areaCalculator() {
        return side1 * side2;
    }

    protected double perimeterCalculator() {
        return side1 * 2 + side2 * 2;
    }

    public void setSide1(double a) {
        side1 = a;
    }

    public void setSide2(double b) {
        side2 = b;
    }
}
