package entity.annnotation.controller;

import entity.annnotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by JDY on 2016/11/3.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    public void execute(){
        System.out.println("UserController excute...");
        userService.add();
    }
}
