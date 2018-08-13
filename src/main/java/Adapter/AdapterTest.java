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
        LogAdapter logAdapter = new LogAdapter(new Log4jLogger());
        logAdapter.debug("测试");
    }
}
