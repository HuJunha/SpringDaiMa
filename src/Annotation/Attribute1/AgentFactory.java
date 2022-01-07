package Annotation.Attribute1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author junhao
 * @Title:
 * @Package
 * @Description:
 * @date 2021/12/1516:12
 */
@Component
public class AgentFactory {
    @Value(value = "衣服")
    private String name;

    @Autowired
    @Qualifier(value = "nikeFactory")
    private factory factory;
    public void product(){
        factory.product();
        System.out.println("工厂正在加工生产"+name);
    }
}
