package HW_4_Abstract.Practicle_1.Practicle_1.Task2;

public class ClassRoom {
    public ClassRoom(Pupil one) {
        one.read();
        one.write();
        one.study();
        one.relax();
    }

    public ClassRoom(Pupil one, Pupil two) {
        this(one);
        two.relax();
        two.study();
        two.write();
        two.read();
    }

    public ClassRoom(Pupil one, Pupil two, Pupil three, Pupil four) {
        this(one, two);
        three.read();
        three.relax();
        three.write();
        three.study();
        four.study();
        four.write();
        four.relax();
        four.read();
    }
}
