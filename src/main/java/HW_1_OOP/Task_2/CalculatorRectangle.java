package HW_1_OOP.Task_2;

import java.util.Scanner;

public class CalculatorRectangle {
    public static void main(String[] args) {
        System.out.println("Введите значения первой и второй стороны, чтобы узнать " +
                "S площадь и P периметр  прямоугольника: ");

        Scanner console = new Scanner(System.in);
        Rectangle sideOne = new Rectangle();
        Rectangle sideTwo = new Rectangle();
        Rectangle result = new Rectangle();
        sideOne.setSide1(console.nextDouble());
        sideTwo.setSide2(console.nextDouble());
        System.out.println("Площадь прямоугольника равна: " + result.areaCalculator());
        System.out.println("Периметр прямоугольника равен: " + result.perimeterCalculator());

    }
}
