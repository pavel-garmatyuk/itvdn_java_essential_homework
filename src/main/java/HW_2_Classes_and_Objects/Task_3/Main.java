package HW_2_Classes_and_Objects.Task_3;

public class Main {
    public static void main(String[] args) {
        Car audi = new Car();
        Car bmw = new Car();
        Car mercedes = new Car();
        Car toyota = new Car();
        Car lada = new Car();
        Car lifan = new Car();
        Car renault = new Car();

        audi.setColor("arctic blue");

        bmw.setYear(2010);
        bmw.setSpeed(240);

        mercedes.setYear(2000);
        mercedes.setWeight(2200);
        mercedes.setColor("diplomat");

        toyota.setYear(2001);
        toyota.setSpeed(160);
        toyota.setWeight(1600);
        toyota.setColor("6P5");

        lada.setYear(2015);
        lada.setColor("rubin");

        lifan.setYear(2009);
        lifan.setSpeed(160);
        lifan.setWeight(1400);

        renault.setColor("taxi");
        renault.setWeight(1700);
        renault.setSpeed(150);

        System.out.println("Audi: " + "\n" + audi.getColor() + " color" + "\n");
        System.out.println("BMW: " + bmw.getYear() + " year" + "\n" + bmw.getSpeed() + " km/ph" + "\n");
        System.out.println("Mercedes-Benz: "+ "\n" + mercedes.getYear() + " year" + "\n" + mercedes.getWeight()
                + " kg" + "\n" + mercedes.getColor() + " color" + "\n");
        System.out.println("Toyota: " + "\n" + toyota.getYear() + " year" + "\n" + toyota.getSpeed() + " km/ph"
                + "\n" + toyota.getWeight() + " kg" + "\n" + toyota.getColor() + " color" + "\n" );
        System.out.println("Lada: " + "\n" + lada.getYear() + " year" + "\n" + lada.getColor() + " color" + "\n");
        System.out.println("Lifan: " + "\n" + lifan.getYear() + " year" + "\n" + lifan.getSpeed() + " km/ph" +  "\n"
                + lifan.getWeight() + " kg" + "\n");
        System.out.println("Renault: " + "\n" + renault.getColor() + " color" + "\n" + renault.getWeight() + " kg"
                + "\n" + renault.getSpeed() + " km/ph" + "\n");
    }
}
