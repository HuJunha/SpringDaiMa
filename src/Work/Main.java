package Work;


import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author junhao
 * @Title:
 * @Package
 * @Description:
 * @date 2021/12/6/17:59
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Work/Emp-config2.xml");
        Employee emp =(Employee) applicationContext.getBean("emp");
        System.out.println(emp);
    }

    @Test
    public  void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Work/autoWire-Config.xml");
        Employee emp = (Employee) applicationContext.getBean("emp");
        System.out.println(emp);
    }
    @Test
    public  void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Work/Emp-config.xml");
        Employee emp = (Employee) applicationContext.getBean("emp");
        System.out.println(emp);
    }
}
