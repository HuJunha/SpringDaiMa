package AOP.annotationTest;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author junhao
 * @Title:
 * @Package
 * @Description:
 * @date 2021/12/2317:21
 */@Component
@Aspect
public class UserProxy {
     @Before(value = "execution(* AOP.annotationTest.User.talk(..))")
     public void before(){
         System.out.println("before....");
     }
     @After(value = "execution(* AOP.annotationTest.User.talk(..))")
     public void  after(){
         System.out.println("after...");
     }

}
