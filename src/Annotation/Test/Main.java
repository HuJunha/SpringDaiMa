package Annotation.Test;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author junhao
 * @Title:
 * @Package
 * @Description:
 * @date 2021/12/815:41
 */
public class Main {
    //
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Annotation/Test/Zhujie-config.xml");
        Person person =(Person) applicationContext.getBean("person");
        person.talk();
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Annotation/Test/Zhujie-config.xml");
        Person person =(Person) applicationContext.getBean("Myperson");
        person.talk();
    }
}
