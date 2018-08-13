package Adapter;

import Adapter.Interface.Log;

/**
 * Created with IntelliJ IDEA
 *
 * @description:
 * @author: yaoweihao
 * @date: 2018/8/13
 * @time: 19:57
 * @modified by:
 */
public class LogAdapter extends Log4jLogger implements Log{
    @Override
    public void error(String s) {
        System.out.print("LogAdapter日志记录: " + s);
    }
    @Override
    public void debug(String s) {
        System.out.print("LogAdapter日志记录: " + s);
    }
    @Override
    public void warn(String s) {
        System.out.print("LogAdapter日志记录: " + s);
    }
}
