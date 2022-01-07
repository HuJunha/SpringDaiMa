package JdbcTemplate;

import JdbcTemplate.Service.ProductService;
import JdbcTemplate.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author junhao
 * @Title:
 * @Package
 * @Description:
 * @date 2021/12/2810:26
 */
public class ProductTest {
    @Test
    public  void test(){
        Product product = new Product();
        product.setProductname("药业");
        product.setProduct_Id("3");
        product.setProductTime("2021,12,28,11,48,36");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("JdbcTemplate/Book-Jdbc.xml");
        ProductService productService = (ProductService) applicationContext.getBean("productService");
        productService.addProduct(product);
    }
}
