package entity.properties;

import entity.autowrite.Address;
import entity.autowrite.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * Created by Administrator on 2016-07-16.
 */
public class main {
    public static void main(String[] args) throws SQLException{
        /*����spring��IOC��������*/
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-properties.xml");

        DataSource dataSource = (DataSource) ctx.getBean("dataSource");
        System.out.println(dataSource.getConnection());

    }
}
