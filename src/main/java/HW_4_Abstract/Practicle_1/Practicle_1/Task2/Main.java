package HW_4_Abstract.Practicle_1.Practicle_1.Task2;

public class Main {
    public static void main(String[] args) {
        ExcelentPupil alexandr = new ExcelentPupil();
        GoodPupil igor = new GoodPupil();
        ExcelentPupil natali = new ExcelentPupil();
        BadPupil ivan = new BadPupil();

        ClassRoom classRoom = new ClassRoom(alexandr, igor, natali, ivan);
    }
}
