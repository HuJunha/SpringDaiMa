package AOP.Annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.params.shadow.com.univocity.parsers.common.processor.core.AbstractObjectProcessor;
import org.springframework.aop.framework.AopConfigException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author junhao
 * @Title:
 * @Package
 * @Description:
 * @date 2021/12/2017:25
 */
@Component
@Aspect
public class UserProxy {

    @Before(value = "execution(* AOP.Annotation.User.add(..))")
    public  void before(){
        System.out.println("before....");
    }
}
