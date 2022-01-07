package AOP.annotationTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author junhao
 * @Title:
 * @Package
 * @Description:
 * @date 2021/12/2317:18
 */
@Component
public class User implements test{

    @Override
    public void talk() {
        System.out.println("user...");
    }

    public  void say(){
        System.out.println("say...");
    }
}
