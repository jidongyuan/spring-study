package entity.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016-07-16.
 */
public class main {
    public static void main(String[] args) {
        /*创建spring的IOC容器对象*/
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

        /*从IOC容器中获取Bean实例*/

        /*通过id获取bean实例*/
        HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
//        helloWorld.hello();
        /*通过类名获取bean*/
//        Car car = ctx.getBean(Car.class);

        Car car1 = (Car) ctx.getBean("car1");
        System.out.println(car1);

        Car car2 = (Car) ctx.getBean("car2");
        System.out.println(car2);

        Person person = (Person) ctx.getBean("person2");
        System.out.println(person);
    }
}
