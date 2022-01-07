package AOP.Bottom;

/**
 * @author junhao
 * @Title:
 * @Package
 * @Description:
 * @date 2021/12/1615:15
 */
public class testImplete  implements test{
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public void update() {
        System.out.println("底层代码测试.....");
    }
}
