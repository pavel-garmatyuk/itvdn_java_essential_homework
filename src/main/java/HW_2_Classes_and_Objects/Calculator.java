package HW_2_Classes_and_Objects;

public class Calculator {
    public int solve(int operandOne, String mathSign, int operandTwo) {
        switch (mathSign) {
            case "-":
                return subtract(operandOne, operandTwo);
            case "*":
                return multiply(operandOne, operandTwo);
            case "/":
                return divide(operandOne, operandTwo);
            case "%":
                return getRemainder(operandOne, operandTwo);
            case "^":
                return powerRising(operandOne, operandTwo);
            default:
                return add(operandOne, operandTwo);
        }
    }

    private int add(int a, int b) {
        return a + b;
    }

    private int subtract(int a, int b) {
        return a - b;
    }

    private int multiply(int a, int b) {
        return a * b;
    }

    private int divide(int a, int b) {
        return a / b;
    }

    private int getRemainder(int a, int b) {
        return a % b;
    }

    private int powerRising(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }
}
