package Annotation.Attribute1;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author junhao
 * @Title:
 * @Package
 *
 * @date 2021/12/15/16:16
 */
public class Main {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Annotation/Attribute1/factory-Config.xml");
        AgentFactory agentFactory = (AgentFactory) applicationContext.getBean("agentFactory");
        agentFactory.product();
    }
}
