package Adapter;

import Adapter.Interface.Logger;

/**
 * Created with IntelliJ IDEA
 *
 * @description: 实现对日志文件的操作
 * @author: yaoweihao
 * @date: 2018/8/28
 * @time: 16:59
 * @modified by:
 */
public class LoggerOperate implements Logger {

    public void writeLogFile(LogBean logBean) {
        System.out.print("操作人: " + logBean.getName() + ", 操作时间: " + logBean.getDate());
    }
}
