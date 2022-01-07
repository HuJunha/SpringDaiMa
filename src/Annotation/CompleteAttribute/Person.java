package Annotation.CompleteAttribute;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author junhao
 * @Title:
 * @Package
 * @Description:
 * @date 2021/12/1517:01
 */
@Component(value = "V")
public class Person implements human{
    @Value(value = "小明")
    private String name;
    @Value(value = "10")
    private  int age;
    @Override
    public void say() {
        System.out.println("Spring注解完全开发");
        System.out.println("name"+name+",age"+age);
    }
}
