package entity.relation;

import entity.autowrite.Address;
import entity.autowrite.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016-07-16.
 */
public class main {
    public static void main(String[] args) {
        /*����spring��IOC��������*/
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-relation.xml");

       /* Address address = (Address) ctx.getBean("address");
        System.out.println(address);*/

        Address address2 = (Address) ctx.getBean("address2");
        System.out.println(address2);

        Address address3 = (Address) ctx.getBean("address3");
        System.out.println(address3);

        Person person = (Person) ctx.getBean("person");
        System.out.println(person);
    }
}
