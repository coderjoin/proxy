package staticproxy;

/**
 * @author qiaoying
 * @date 2019-03-19 14:01
 */
public class Test {

    public static void main(String[] args) {
        BussinessProxy bussinessProxy = new BussinessProxy(new Bussiness());
        bussinessProxy.execute();
    }
}
