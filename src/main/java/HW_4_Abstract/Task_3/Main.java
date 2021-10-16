package HW_4_Abstract.Task_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Player record = new Player();

        Scanner console = new Scanner(System.in);
        String say = console.nextLine();
        System.out.println("Напишите 'play' для воспроизведения или 'record' для записи");
        if (say.equalsIgnoreCase("play")) {
            System.out.println("Приятного просмотра!");
            Player play = new Player();
            play.
        } else if (say.equalsIgnoreCase("record")) {
            System.out.println("Началась запись");

        }
    }
}
