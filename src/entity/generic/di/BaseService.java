package entity.generic.di;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2016-11-09.
 */
public class BaseService<T> {

    @Autowired
    protected BaseRepository<T> repository;

    public void add(){
        System.out.println("add...");
        System.out.println(repository);
    }
}
