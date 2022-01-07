package Annotation.Test;

import org.springframework.stereotype.Component;

/**
 * @author junhao
 * @Title:
 * @Package
 * @Description:
 * @date 2021/12/815:40
 */
@Component(value = "Myperson")
/*@Repository*/
public class Person {
    public Person() {
    }
    public void talk(){
        System.out.println("注解在加载。。。");
    }
}
