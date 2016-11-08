package entity.annnotation.repository;

import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2016-11-08.
 */
@Repository
public class UserJdbcRepository implements UserRepository {
    @Override
    public void save() {
        System.out.println("UserJdbcRepository save ...");
    }
}
