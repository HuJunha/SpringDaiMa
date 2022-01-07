package Annotation.CompleteAttribute;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author junhao
 * @Title:
 * @Package
 * @Description:
 * @date 2021/12/15/17:07
 */
public class Main {
    //基于注解完全开发
    @Test
    public  void test(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("Annotation.CompleteAttribute");
        Annotation.CompleteAttribute.Person v = (Annotation.CompleteAttribute.Person) applicationContext.getBean("V");
        v.say();
    }
    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Annotation/CompleteAttribute/person-Config.xml");
        Annotation.CompleteAttribute.Person person = (Annotation.CompleteAttribute.Person) applicationContext.getBean("V");
        person.say();
    }
}

