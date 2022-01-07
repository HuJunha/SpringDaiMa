package AOP.Bottom;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.InterfaceAddress;
import java.util.Arrays;

/**
 * @author junhao
 * @Title:
 * @Package
 * @Description:
 * @date 2021/12/16/15:05
 */


//AOP底层代码
public class JDKProxy {
    public static void main(String[] args){
        Class [] interfaces = {test.class};
        testImplete testImplete = new testImplete();
        test o = (test) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new handler(testImplete));
        int add = o.add(1, 2);
        System.out.println(add);
    }
}




//创建代理类对象
class handler implements InvocationHandler{
    private  Object obj;
    public handler(Object obj){
        this.obj = obj;
    }

    //增强的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("方法调用之前..."+method.getName()+"传递的参数:"+Arrays.toString(args));
        Object invoke = method.invoke(obj, args);
        System.out.println("方法调用之后..."+invoke);
        return invoke;
    }
}