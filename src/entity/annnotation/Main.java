package entity.annnotation;

import entity.annnotation.controller.UserController;
import entity.annnotation.repository.UserRepository;
import entity.annnotation.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by JDY on 2016/11/3.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-annotation.xml");

        /*TestObject to = (TestObject)ctx.getBean("testObject");
        System.out.println(to);

        UserController userController = (UserController)ctx.getBean("userController");
        System.out.println(userController);


        UserService userService = (UserService)ctx.getBean("userService");
        System.out.println(userService);*/

        /*UserRepository userRepository = (UserRepository)ctx.getBean("userRepository");
        System.out.println(userRepository);*/

        UserController userController = (UserController)ctx.getBean("userController");
        System.out.println(userController);
        userController.execute();
    }
}
