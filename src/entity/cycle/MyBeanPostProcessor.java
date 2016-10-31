package entity.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by JDY on 2016/10/31.
 */
public class MyBeanPostProcessor  implements BeanPostProcessor{


    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization:" + bean + "," + beanName);
        if("car".equals(beanName)){
            /*...*/
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization:" + bean + "," + beanName);
        Car car = new Car();
        car.setBrand("ford");
        return car;
    }
}
