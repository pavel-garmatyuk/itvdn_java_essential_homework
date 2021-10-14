package HW_3_Inheritance_and_polymorphism.Task3;

public class Main {
    public static void main(String[] args) {

        Vehicle audi = new Car(15, 20, 2000, 260, 2018);
        Vehicle albatross = new Plane(20, 30, 10_000_000, 90, 2010, 1500, 120);
        Vehicle twin = new Ship(35, 45, 9_000_000, 111, 2018, 2, "Rodos");

        System.out.println(audi);
        System.out.println(albatross);
        System.out.println(twin);

    }
}
