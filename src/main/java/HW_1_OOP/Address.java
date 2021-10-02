package HW_1_OOP;

public class Address {
    private int index;
    private String country;
    private String city;
    private String street;
    private int house;
    private int apartment;

    void setIndex(int i) {
        index = i;
    }

    int getIndex() {
        return index;
    }

    void setCountry(String aCountry) {
        country = aCountry;
    }

    String getCountry() {
        return country;
    }

    void setCity(String aCity) {
        city = aCity;
    }

    String getCity() {
        return city;
    }

    void setStreet(String aStreet) {
        street = aStreet;
    }

    String getStreet() {
        return street;
    }

    void setHouse(int aHouse) {
        house = aHouse;
    }

    int getHouse() {
        return house;
    }

    void  setApartment(int aApartment) {
        apartment = aApartment;
    }

    int getApartment() {
        return apartment;
    }

}
