package HW_2_Classes_and_Objects.Task_2;

public class Main {
    public static void main(String[] args) {
        Car audi = new Car();
        audi.setColor("polar blue");
        audi.setYear(2020);
        System.out.println("Color: " + audi.getColor() + "Year: " + audi.getYear());

        Car brabus = new Car(2000, "deep dark");
        System.out.println("Color: " + brabus.getColor() + "Year: " + brabus.getYear());

        Car peugeot = new Car("pantone");
        peugeot.setYear(2010);
        System.out.println("Color: " + peugeot.getColor() + "Year: " + peugeot.getYear());

    }
}