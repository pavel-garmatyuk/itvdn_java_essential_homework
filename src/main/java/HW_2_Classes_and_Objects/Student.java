package HW_2_Classes_and_Objects;

import java.util.Scanner;

public class Student {
    private String name;
    private String birthday;
    private int telephoneContact;
    private int groupNumber;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getTelephoneContact() {
        return telephoneContact;
    }

    public void setTelephoneContact(int telephoneContact) {
        this.telephoneContact = telephoneContact;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }



    public Student() {

    }

    public Student(int groupNumber) {
        this("Егор","", 8, groupNumber);
    }

    public Student(String name, String birthday){
        this.name = name;
        this.birthday = birthday;
    }

    public Student(String name, String birthday, int telephoneContact, int groupNumber) {
        this(name, birthday);
        this.telephoneContact = telephoneContact;
        this.groupNumber = groupNumber;
    }

    public static void main(String[] args) {
        Student student = new Student();
        Scanner console = new Scanner(System.in);
        System.out.println("Введите данные в форму: ");

        System.out.println("ФИО");
        student.setName(console.nextLine());

        System.out.println("Дату Вашего дня рождения: ");
        student.setBirthday(console.nextLine());

        System.out.println("Контактный номер телефона: ");
        student.setTelephoneContact(console.nextInt());

        System.out.println("Номер группы: ");
        student.setGroupNumber(console.nextInt());

        System.out.println("ФИО" + student.getName() + "|" + "Дата рождения: " + student.getBirthday() + "|"
        + "Телефон для связи: " + student.getTelephoneContact() + "|" + "Группа: " + student.getName() + "|"
                + student.getGroupNumber());

    }
}
