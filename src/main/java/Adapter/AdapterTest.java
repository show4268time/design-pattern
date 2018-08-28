package Adapter;

import Adapter.Interface.Logger;

import java.util.Date;

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
        Logger logger = new LoggerOperate();

        LogAdapter logAdapter = new LogAdapter(logger);
        logAdapter.addLog("showtime", new Date());
    }
}
