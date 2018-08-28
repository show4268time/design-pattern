package Adapter;

import Adapter.Interface.Log;
import Adapter.Interface.Logger;

import java.util.Date;

/**
 * Created with IntelliJ IDEA
 *
 * @description: 适配器对象
 * @author: yaoweihao
 * @date: 2018/8/13
 * @time: 19:57
 * @modified by:
 */
public class LogAdapter implements Log{
    private Logger loggerOperate;

    public LogAdapter(Logger loggerOperate){
        this.loggerOperate = loggerOperate;
    }

    /**
     * 将参数组装后调用LoggerOperate
     * @param name
     * @param date
     */
    public void addLog(String name, Date date) {
        LogBean logBean = new LogBean();
        logBean.setDate(date);
        logBean.setName(name);

        loggerOperate.writeLogFile(logBean);
    }
}
