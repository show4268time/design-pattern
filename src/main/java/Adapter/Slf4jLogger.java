package Adapter;

/**
 * Created with IntelliJ IDEA
 *
 * @description:
 * @author: yaoweihao
 * @date: 2018/8/13
 * @time: 14:10
 * @modified by:
 */
public class Slf4jLogger implements Logger{
    public void error(String s) {
        System.out.print("Slf4j日志记录: " + s);
    }

    public void debug(String s) {
        System.out.print("Slf4j日志记录: " + s);
    }

    public void warn(String s) {
        System.out.print("Slf4j日志记录: " + s);
    }
}
