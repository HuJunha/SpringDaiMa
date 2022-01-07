package Annotation.Attribute1;

import org.springframework.stereotype.Component;

/**
 * @author junhao
 * @Title:
 * @Package
 * @Description:
 * @date 2021/12/1516:22
 */
@Component
public class AddidasFactory implements factory{
    @Override
    public void product() {
        System.out.println("正在摸鱼");
    }
}
