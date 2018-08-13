package Adapter;

/**
 * Created with IntelliJ IDEA
 *
 * @description:
 * @author: yaoweihao
 * @date: 2018/8/13
 * @time: 15:09
 * @modified by:
 */
public class AdapterTest {

    public static void main(String[] args){
        LogAdapterImpl logAdapterImpl = new LogAdapterImpl(new Log4jLogger());
        logAdapterImpl.debug("测试");


        LogAdapter logAdapter = new LogAdapter();
        logAdapter.warn("测试");
    }
}
