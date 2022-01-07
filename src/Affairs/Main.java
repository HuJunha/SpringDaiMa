package Affairs;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author junhao
 * @Title:
 * @Package
 * @Description:
 * @date 2021/12/3117:45
 */
public class Main {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Affairs/Affairs.xml");
        person person = (person) applicationContext.getBean("person");

    }
}
