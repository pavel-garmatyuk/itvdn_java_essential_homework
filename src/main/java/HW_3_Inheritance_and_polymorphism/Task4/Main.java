package HW_3_Inheritance_and_polymorphism.Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String point = "";
        System.out.println("Введите ключ продукта: ");

        point = console.nextLine();

        switch (point) {
            case "pro":
                ProDocumentWorker proDocumentWorker = new ProDocumentWorker();
                proDocumentWorker.openDocument();
                proDocumentWorker.editDocument();
                proDocumentWorker.saveDocument();
                break;
            case "exp":
                ExpertDocumentWorker expertDocumentWorker = new ExpertDocumentWorker();
                expertDocumentWorker.openDocument();
                expertDocumentWorker.editDocument();
                expertDocumentWorker.saveDocument();
                break;
            default:
                DocumentWorker documentWorker = new DocumentWorker();
                documentWorker.openDocument();
                documentWorker.editDocument();
                documentWorker.saveDocument();

        }

    }
}

