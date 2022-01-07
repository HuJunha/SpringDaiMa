package Annotation.Attribute;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author junhao
 * @Title:
 * @Package
 * @Description:
 * @date 2021/12/1510:25
 */
@Component
public class Service {
    @Value(value = "abc")
    private  String name;
    @Autowired
    /*@Qualifier(value = "student")*报错，Studnet类注解为Service，test-config.xml限制了
     */
   @Qualifier(value = "student")
    private  dao dao;


    public void add() {
        System.out.println("Service正在加载...."+name);
        dao.add();
    }
}
