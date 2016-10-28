package entity.spEl;


/**
 * Created by Administrator on 2016-10-12.
 */
public class Person {
    private String name;
    private Car car ;

    /*引用address bean的city属性 */
    private String city;

    /*根据car的price确定info：car的price >= 300000:金领 否则：白领 */
    private String info;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", car=" + car +
                ", city='" + city + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}