package HW_3_Inheritance_and_polymorphism.Task2;

public class BadPupil extends Pupil {
    @Override
    void study() {
        System.out.println("Я не хожу на пары");
    }

    @Override
    void write() {
        System.out.println("Я пишу с ошибками");
    }

    @Override
    void read() {
        System.out.println("Я давно ничего не читал");
    }

    @Override
    void relax() {
        System.out.println("Я отдыхаю с пивом");
    }
}
