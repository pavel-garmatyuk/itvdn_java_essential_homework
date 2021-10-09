package HW_3_Inheritance_and_polymorphism.Task2;

public class GoodPupil extends Pupil {
    @Override
    void read() {
        System.out.println("Почитываю на досуге");
    }

    @Override
    void write() {
        System.out.println("Я правильно пишу");
    }

    @Override
    void study() {
        System.out.println("Я хорошо учусь");
    }

    @Override
    void relax() {
        System.out.println("Люблю залипать в Ютубчик");
    }
}
