package Adapter.Interface;

import Adapter.LogBean;

/**
 * Created with IntelliJ IDEA
 *
 * @description: 读取日志文件
 * @author: yaoweihao
 * @date: 2018/8/13
 * @time: 13:53
 * @modified by:
 */
public interface Logger {
    /**
     * 写日志文件，把日志列表写出到日志文件中去
     * @param logBean 要写到日志文件的日志bean
     */
    void writeLogFile(LogBean logBean);
}
