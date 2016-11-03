package entity.annnotation.repository;

import org.springframework.stereotype.Repository;

/**
 * Created by JDY on 2016/11/3.
 */

@Repository("userRepository")
public class UserRepositoryImpl implements UserRepository {
    @Override
    public void save() {
        System.out.println("UserRepository Save ...");
    }
}
