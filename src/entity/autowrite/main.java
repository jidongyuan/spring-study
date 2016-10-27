package entity.autowrite;

import entity.autowrite.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016-07-16.
 */
public class main {
    public static void main(String[] args) {
        /*创建spring的IOC容器对象*/
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-autowire.xml");
        Person person = (Person) ctx.getBean("person");
        System.out.println(person);
    }
}
