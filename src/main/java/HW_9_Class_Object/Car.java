package HW_9_Class_Object;

import java.util.Objects;

public class Car {
    private int id;
    private String carBrand;
    private String modelName;
    private int release;
    private String color;
    private double price;
    private String vehicleRegistrationNumber;

    public Car() {
    }

    public Car(int id, String carBrand, String modelName) {
        this.id = id;
        this.carBrand = carBrand;
        this.modelName = modelName;
    }

    public Car(int id, String carBrand, String modelName, int release, String color, double price, String vehicleRegistrationNumber) {
        this(id, carBrand, modelName);
        this.release = release;
        this.color = color;
        this.price = price;
        this.vehicleRegistrationNumber = vehicleRegistrationNumber;
    }

    public int getId() {
        return id;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getModelName() {
        return modelName;
    }

    public int getRelease() {
        return release;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public String getVehicleRegistrationNumber() {
        return vehicleRegistrationNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", carBrand='" + carBrand + '\'' +
                ", modelName='" + modelName + '\'' +
                ", release=" + release +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", vehicleRegistrationNumber='" + vehicleRegistrationNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return getId() == car.getId() && getRelease() == car.getRelease() && Double.compare(car.getPrice(),
                getPrice()) == 0 && getCarBrand().equals(car.getCarBrand()) && getModelName().equals(car.getModelName())
                && getColor().equals(car.getColor())
                && getVehicleRegistrationNumber().equals(car.getVehicleRegistrationNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getCarBrand(), getModelName(), getRelease(), getColor(), getPrice(),
                getVehicleRegistrationNumber());
    }
}
