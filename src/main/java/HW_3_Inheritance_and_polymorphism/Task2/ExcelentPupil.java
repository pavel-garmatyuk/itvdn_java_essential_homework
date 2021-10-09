package HW_3_Inheritance_and_polymorphism.Task2;

public class ExcelentPupil extends Pupil {

    @Override
    void study() {
        System.out.println("Я постоянно учусь");
    }

    @Override
    void read() {
        System.out.println("Быстро читаю");
    }

    @Override
    void write() {
        System.out.println("Пишу без ошибок");
    }

    @Override
    void relax() {
        System.out.println("Отдыхаю с книгой");
    }
}

