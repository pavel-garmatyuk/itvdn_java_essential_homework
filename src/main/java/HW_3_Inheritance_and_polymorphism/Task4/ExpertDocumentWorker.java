package HW_3_Inheritance_and_polymorphism.Task4;

public class ExpertDocumentWorker extends ProDocumentWorker {
    @Override
    void saveDocument() {
        System.out.println("Документ сохранен в новом формате");
    }
}
