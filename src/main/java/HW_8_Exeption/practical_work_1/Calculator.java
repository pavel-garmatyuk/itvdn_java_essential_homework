package HW_8_Exeption.practical_work_1;

public class Calculator {
    public int solve(int operandOne, String mathSign, int operandTwo) throws ArithmeticException {
        switch (mathSign) {
            case "+":
                return add(operandOne, operandTwo);
            case "-":
                return sub(operandOne, operandTwo);
            case "*":
                return mul(operandOne, operandTwo);
            case "/":
                return div(operandOne, operandTwo);

            default:
                return 0;
        }
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) throws ArithmeticException {
        return a / b;
    }


}
