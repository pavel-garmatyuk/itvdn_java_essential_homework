package Starter;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String answer = "";

        do {
            System.out.println("Введите первый операнд, затем знак арифметической операции, и второй операнд.\n"
                    + "Разрешенные знаки арифметической операции: \nСложение + \nВычитание - \nУмножение * \nДеление / "
                    + "\nВозвести в степень ^ \nПолучить остаток от деления %");
            com.java_essential.starter_garmatyuk.Calculator calculator = new com.java_essential.starter_garmatyuk.Calculator();
            System.out.println(calculator.solve(Integer.parseInt(console.nextLine()), console.nextLine(),
                    Integer.parseInt(console.nextLine())));
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            answer = console.nextLine();

            while (true) {
            if (answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("yes")) {
                break;
            } else {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
            }
                answer = console.nextLine();
            }
            if (answer.equalsIgnoreCase("no")){
                break;
            }

        } while ("yes".equals(answer));
    }
}