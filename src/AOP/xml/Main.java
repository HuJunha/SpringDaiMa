package AOP.xml;

import Collection1.Book;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author junhao
 * @Title:
 * @Package
 * @Description:
 * @date 2021/12/2414:41
 */
public class Main {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("AOP/xml/xml-Config.xml");
       book bean = (book) applicationContext.getBean("book");
       bean.add();
    }
    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("AOP/xml/bookProxy.xml");
        book book = (book) applicationContext.getBean("book");
        book.add();

    }
}
