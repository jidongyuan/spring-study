package entity.beans;

/**
 * Created by Administrator on 2016-07-30.
 */
public class Car {
    private String brand;
    private String corp;
    private int price;
    private double maxSpeed;

    public Car(String brand, String corp, int price) {
        this.brand = brand;
        this.corp = corp;
        this.price = price;
    }

    public Car(String brand, double maxSpeed, String corp) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.corp = corp;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", corp='" + corp + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
