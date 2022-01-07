package Annotation.Attribute;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author junhao
 * @Title:
 * @Package
 * @Description:
 * @date 2021/12/1511:00
 */

    @Service
public class Student implements dao{
    @Override
    public void add() {
        System.out.println("Student正在加载....");
    }
}
