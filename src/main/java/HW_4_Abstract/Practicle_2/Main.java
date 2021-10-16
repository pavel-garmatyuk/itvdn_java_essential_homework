package HW_4_Abstract.Practicle_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Введите название фигуры, площадь которой Вы хотите найти:" + "\n"
                + "Круг" + "\n" + "Прямоугольник" + "\n" + "Прямоугольный треугольник" + "\n" + "Трапеция");


        String answer = console.nextLine();

        int result;
        switch (answer) {
            case "Круг":
                System.out.println("Введите радиус: ");
                int radius = console.nextInt();
                Circle circle = new Circle(radius);
                result = circle.calculateArea();
                break;
            case "Прямоугольник":
                System.out.println("Введите значения сторон прямоугольника : ");
                int sideOne = console.nextInt();
                int sideTwo = console.nextInt();
                Rectangle rectangle = new Rectangle(sideOne, sideTwo);
                result = rectangle.calculateArea();
                break;
            case "Прямоугольный треугольник":
                System.out.println("Введите значения сторон прямоугольного треугольника : ");
                int sideOneR = console.nextInt();
                int sideTwoR = console.nextInt();
                RightTriangle rightTriangle = new RightTriangle(sideOneR, sideTwoR);
                result = rightTriangle.calculateArea();
                break;
            case "Трапеция":
                System.out.println("Введите значения сторон прямоугольного треугольника : ");
                int sideOneT = console.nextInt();
                int sideTwoT = console.nextInt();
                int height = console.nextInt();
                Trapezoid trapezoid = new Trapezoid(sideOneT, sideTwoT, height);
                result = trapezoid.calculateArea();
                break;
            default:
                return;
        }
        System.out.println(result);
    }

}
