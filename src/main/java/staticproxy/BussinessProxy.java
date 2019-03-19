package staticproxy;

/**
 * @author qiaoying
 * @date 2019-03-19 13:56
 */
public class BussinessProxy implements BussinessInterface {

    private BussinessInterface bussinessInterface ;

    public BussinessProxy(BussinessInterface bussinessInterface) {
        this.bussinessInterface = bussinessInterface;
    }

    public void execute() {
        System.out.println("拦截前。。。。。");
        bussinessInterface.execute();
        System.out.println("拦截后。。。。。");
    }
}
