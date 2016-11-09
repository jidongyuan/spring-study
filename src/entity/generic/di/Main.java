package entity.generic.di;

import entity.annnotation.service.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2016-11-09.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-generic.di.xml");
        UserService userService = (UserService)ctx.getBean("userService");
        userService.add();
    }
}
