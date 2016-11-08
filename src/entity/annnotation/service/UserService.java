package entity.annnotation.service;

import entity.annnotation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by JDY on 2016/11/3.
 */

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(@Qualifier("userRepositoryImpl") UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void add(){
        System.out.println("UserService add..");
        userRepository.save();
    }
}

