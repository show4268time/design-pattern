package Adapter;

import java.util.Date;

/**
 * Created with IntelliJ IDEA
 *
 * @description: 日志数据对象
 * @author: yaoweihao
 * @date: 2018/8/28
 * @time: 16:37
 * @modified by:
 */
public class LogBean {
    //日志操作人员
    private String name;
    //日志操作时间
    private Date date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
