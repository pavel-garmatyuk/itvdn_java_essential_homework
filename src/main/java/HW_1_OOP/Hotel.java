package HW_1_OOP;

public class Hotel {
    public static void main(String[] args) {
        Address address = new Address();
        address.setIndex(1);
        address.setCountry("Russian Federation");
        address.setCity("Moscow");
        address.setStreet("Pushkina");
        address.setHouse(5);
        address.setApartment(1);

        System.out.println(address.getIndex() + " " + address.getCountry() + " " + address.getCity() + " "
                + address.getStreet() + " " + address.getHouse() + " "  + address.getApartment());
    }
}
