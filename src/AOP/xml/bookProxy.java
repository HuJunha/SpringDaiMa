package AOP.xml;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author junhao
 * @Title:
 * @Package
 * @Description:
 * @date 2021/12/24/10:50
 */
@Component
@Aspect
public class bookProxy {
    @Before(value = "execution(* AOP.xml.book.add(..))")
    public void add(){
        System.out.println("bookProxy...");
    }
    @Around(value = "execution(* AOP.xml.book.add(..))")
    public void around(ProceedingJoinPoint prj)throws Throwable{
            System.out.println("环绕开始前...");
            Object proceed = prj.proceed();
            System.out.println("环绕开始后...");
    }


}
