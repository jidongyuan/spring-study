package entity.factory;

/**
 * Created by Administrator on 2016-10-27.
 */
public class Car {
    private String brand;
    private double price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    public Car(){
        System.out.println("Car's Constructor...");
    }

    public Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }
}
