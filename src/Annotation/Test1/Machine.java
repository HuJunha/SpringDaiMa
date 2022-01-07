package Annotation.Test1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author junhao
 * @Title:
 * @Package
 * @Description:
 * @date 2021/12/209:28
 */
@Component
public class Machine {
    @Autowired
    @Qualifier(value = "meatFactory")
    //@Value("MeatFactory")编译不通过
    private  factory factory;

    public void setFactory(factory factory){
        this.factory=factory;
    }
    public void ready(){
        System.out.println("机器正在准备...");
        factory.product();
    }
}
