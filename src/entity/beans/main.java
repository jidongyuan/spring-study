package entity.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016-07-16.
 */
public class main {
    public static void main(String[] args) {
        /*����spring��IOC��������*/
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

        /*��IOC�����л�ȡBeanʵ��*/

        /*ͨ��id��ȡbeanʵ��*/
        HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
//        helloWorld.hello();
        /*ͨ��������ȡbean*/
//        Car car = ctx.getBean(Car.class);

        Car car1 = (Car) ctx.getBean("car1");
        System.out.println(car1);

        Car car2 = (Car) ctx.getBean("car2");
        System.out.println(car2);

        Person person = (Person) ctx.getBean("person2");
        System.out.println(person);
    }
}
