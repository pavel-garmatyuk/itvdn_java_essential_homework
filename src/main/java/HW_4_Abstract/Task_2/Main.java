package HW_4_Abstract.Task_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String documentFormat = console.nextLine();

        while (true) {
            if (documentFormat.equalsIgnoreCase(".xml")) {
                XMLHandler xmlDoc = new XMLHandler();
                xmlDoc.create();
                xmlDoc.open();
                xmlDoc.change();
                xmlDoc.save();
                break;
            } else if (documentFormat.equalsIgnoreCase(".txt")) {
                TXTHandler txtDoc = new TXTHandler();
                txtDoc.create();
                txtDoc.open();
                txtDoc.change();
                txtDoc.save();
                break;
            } else if (documentFormat.equalsIgnoreCase(".doc")) {
                DOCHandler docDoc = new DOCHandler();
                docDoc.create();
                docDoc.open();
                docDoc.change();
                docDoc.save();
                break;
            } else  if (!documentFormat.equalsIgnoreCase(".xml")
                    && !documentFormat.equalsIgnoreCase(".txt")
                    && !documentFormat.equalsIgnoreCase(".doc")) {
            } else {
                System.out.println("Format Error!"); // сообщение не выпадает. Я через брейки и else if  так переиграл. Однако все ломается.
                // не получается решить такие задачи. С калькуляторами такая же ерунда. Эта ошибка со мной тянется и тянется.
            }
        }
    }
}
