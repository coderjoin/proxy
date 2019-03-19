package dynamicproxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author qiaoying
 * @date 2019-03-19 14:16
 */
public class BussinessProxy implements InvocationHandler {

    private Object object;

    public BussinessProxy(Object object) {
        this.object = object;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前置内容。。。。");
        method.invoke(object,args);
        System.out.println("后置内容。。。。");
        return null;
    }
}
