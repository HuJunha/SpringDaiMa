package Annotation.Attribute;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author junhao
 * @Title:
 * @Package
 * @Description:
 * @date 2021/12/1510:45
 */
public class Main {
    //测试注解指定类注入
    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Annotation/Attribute/dao-Config.xml");
        Service service = (Service) applicationContext.getBean("service");
    service.add();
    }

}
