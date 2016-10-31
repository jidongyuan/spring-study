package entity.factory;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by JDY on 2016/10/31.
 *
 * 实例工厂方法：实例工厂方法。即现需要创建工厂本身，再调用工厂的实例方法来返回bean的实例
 *
 */
public class InstanceCarFactory {
    /*Map是接口,HashMap是Map实现类*/
    private static Map<String,Car> cars = null;

    public InstanceCarFactory(){
        cars = new HashMap<String,Car>();
        cars.put("audi",new Car("audi",300000));
        cars.put("ford",new Car("ford",200000));
    }

    public static Car getCar(String brand){
        return cars.get(brand);
    }

}
