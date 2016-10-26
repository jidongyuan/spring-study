package entity.collections;

import entity.beans.Car;
import entity.beans.HelloWorld;
import entity.collections.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016-07-16.
 */
public class main {
    public static void main(String[] args) {
        /*创建spring的IOC容器对象*/
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");

        Person person = (Person) ctx.getBean("person3");
        System.out.println(person);

        NewPerson newPerson = (NewPerson)ctx.getBean("newPerson");
        System.out.println(newPerson);

        DataSource dataSource = ctx.getBean(DataSource.class);
        System.out.println(dataSource.getProperties());

        Person person2 = (Person) ctx.getBean("person4");
        System.out.println(person2);

        Person person5 = (Person) ctx.getBean("person5");
        System.out.println(person5);
    }
}
