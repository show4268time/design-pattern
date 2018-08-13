package Adapter.Interface;

/**
 * Created with IntelliJ IDEA
 *
 * @description: 日志抽象类
 * @author: yaoweihao
 * @date: 2018/8/13
 * @time: 13:32
 * @modified by:
 */
public interface Log {
    void error(String s);
    void debug(String s);
    void warn(String s);
}
