package entity.annnotation.repository;

import entity.annnotation.TestObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by JDY on 2016/11/3.
 */

@Repository
public class UserRepositoryImpl implements UserRepository {
    @Autowired(required = false)
    private TestObject testObject;
    @Override
    public void save() {
        System.out.println("UserRepository Save ...");
        System.out.println(testObject);
    }
}
