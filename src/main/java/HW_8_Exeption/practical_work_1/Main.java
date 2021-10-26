package HW_8_Exeption.practical_work_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        Calculator calculator = new Calculator();
        try {
            calculator.solve(Integer.parseInt(console.nextLine()), console.nextLine(),
                    Integer.parseInt(console.nextLine()));
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

    }
}
