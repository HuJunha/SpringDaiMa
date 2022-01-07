package AOP.Annotation;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author junhao
 * @Title:
 * @Package
 * @Description:
 * @date 2021/12/2017:45
 */
public class Main {
    @Test
    public  void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("AOP/Annotation/User-Config.xml");
        User user = (User) applicationContext.getBean("user");
        user.add();
    }
}
