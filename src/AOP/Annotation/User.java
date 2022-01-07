package AOP.Annotation;

import org.springframework.stereotype.Component;

/**
 * @author junhao
 * @Title:
 * @Package
 * @Description:
 * @date 2021/12/2017:24
 */
@Component
public class User {
    public  void add(){
        System.out.println("add....");
    }
}
