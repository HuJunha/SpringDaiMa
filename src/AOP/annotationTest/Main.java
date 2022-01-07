package AOP.annotationTest;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author junhao
 * @Title:
 * @Package
 * @Description:
 * @date 2021/12/2317:33
 */
public class Main {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("AOP/annotationTest/Tuser-Config.xml");
        test user = (test) applicationContext.getBean("user");
        //User user = (User) applicationContext.getBean("user");要强制成接口才能实现，不然报错
        user.talk();
    }
}
