package Annotation.Attribute;

import org.springframework.stereotype.Component;

/**
 * @author junhao
 * @Title:
 * @Package
 * @Description:
 * @date 2021/12/1510:23
 */


@Component
public class DaoDao implements dao{
    @Override
    public void add() {
        System.out.println("DaoDao正在加载...");
    }
}
