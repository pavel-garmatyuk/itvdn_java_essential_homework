package HW_1_OOP.Task_4;

public class Computer {
    public static void main(String[] args) {
        Computer[] computers = new Computer[5];

        for (int i = 0; i < computers.length; i++) {
            computers[i] = new Computer();
            System.out.println("Компьютер: " + i);
        }
    }
}
