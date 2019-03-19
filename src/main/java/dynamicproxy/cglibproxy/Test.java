package dynamicproxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author qiaoying
 * @date 2019-03-19 14:37
 */
public class Test {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Bussiness.class);
        enhancer.setCallback(new BussinessInterceptor());
        Bussiness bussiness = (Bussiness) enhancer.create();
        bussiness.execute();
    }
}
