package Collection1;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author junhao
 * @Title:
 * @Package
 * @Description:
 * @date 2021/12/7/10:50
 */
public class CollectionTest {
    @Test
    public  void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Collection1/Conllection-Config1.xml");
        Collection col = (Collection) applicationContext.getBean("col");
        col.tell();
    }

    @Test
    public  void  test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Collection1/Conllection-Config1.xml");
        Collection col = (Collection) applicationContext.getBean("col");
        col.tell();
    }

    @Test
    public  void test2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Collection1/Book-Config.xml");
        Book b2 = (Book) applicationContext.getBean("b2");
        System.out.println(b2);
    }
}
