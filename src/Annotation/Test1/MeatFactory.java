package Annotation.Test1;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author junhao
 * @Title:
 * @Package
 * @Description:
 * @date 2021/12/209:26
 */
@Service(value = "meatFactory")
public class MeatFactory implements factory{
    @Override
    public void product() {
        System.out.println("正在加工肉类");
    }
}
