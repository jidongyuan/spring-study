package entity.cycle;

/**
 * Created by JDY on 2016/10/31.
 */
public class Car {
    public Car() {
        System.out.println("Car's Constructor...");
    }

    private String brand;

    public void setBrand(String band) {
        System.out.println("setBrand");
        this.brand = band;
    }

    public void init(){
        System.out.println("init...");
    }

    public void destory(){
        System.out.println("destory...");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
