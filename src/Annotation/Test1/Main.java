package Annotation.Test1;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author junhao
 * @Title:
 * @Package
 * @Description:
 * @date 2021/12/209:27
 */
public class Main {
    @Test
    public  void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Annotation/Test1/factory-Config.xml");
        Machine machine = (Machine) applicationContext.getBean("machine");
        machine.ready();
    }

    @Test
    public void  test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Annotation/Test1/exclude-Config.xml");
        Machine machine = (Machine) applicationContext.getBean("machine");
        machine.ready();
    }
}
