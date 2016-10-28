package entity.scope;

import entity.autowrite.Address;
import entity.autowrite.Car;
import entity.autowrite.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016-07-16.
 */
public class main {
    public static void main(String[] args) {
        /*����spring��IOC��������*/
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-scope.xml");

        Car car = (Car) ctx.getBean("car");
        Car car2 = (Car) ctx.getBean("car");
        System.out.println(car == car2);
    }
}
