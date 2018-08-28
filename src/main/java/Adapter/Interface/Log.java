package Adapter.Interface;

import java.util.Date;

/**
 * Created with IntelliJ IDEA
 *
 * @description: 新增日志
 * @author: yaoweihao
 * @date: 2018/8/13
 * @time: 13:32
 * @modified by:
 */
public interface Log {
    /**
     * 新增日志
     * @param name
     * @param date
     */
     void addLog(String name, Date date);
}
