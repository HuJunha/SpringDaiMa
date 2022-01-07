package Annotation.Attribute1;

import org.springframework.stereotype.Component;

/**
 * @author junhao
 * @Title:
 * @Package
 * @Description:
 * @date 2021/12/1516:12
 */
@Component
public class NikeFactory implements factory {
    @Override
    public void product() {
        System.out.println("Nike工厂正在设计");
    }
}
