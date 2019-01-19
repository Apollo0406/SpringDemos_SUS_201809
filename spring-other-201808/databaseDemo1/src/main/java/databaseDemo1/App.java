package databaseDemo1;

import databaseDemo1.Dao.ProductDao;
import databaseDemo1.model.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    private static ProductDao dao;

    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        dao=(ProductDao)context.getBean("productDao");
        Product product = dao.getProduct(1);

        System.out.println(product);
    }
}
