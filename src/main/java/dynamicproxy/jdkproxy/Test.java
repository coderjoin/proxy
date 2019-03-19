package dynamicproxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author qiaoying
 * @date 2019-03-19 14:20
 */
public class Test {
    public static void main(String[] args) {
        BussinessInterface bussinessInterface = new BussinessImpl();
        InvocationHandler invocationHandler = new BussinessProxy(bussinessInterface);
        BussinessInterface proxy = (BussinessInterface) Proxy.newProxyInstance(BussinessInterface.class.getClassLoader(),
                new Class[]{BussinessInterface.class}, invocationHandler);
        proxy.execute();
    }
}
