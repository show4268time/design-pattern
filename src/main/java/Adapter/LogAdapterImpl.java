package Adapter;

import Adapter.Interface.Log;
import Adapter.Interface.Logger;

/**
 * Created with IntelliJ IDEA
 *
 * @description:
 * @author: yaoweihao
 * @date: 2018/8/13
 * @time: 14:14
 * @modified by:
 */
public class LogAdapterImpl implements Log {
    private Logger logger;

    public LogAdapterImpl(Logger logger){
        this.logger = logger;
    }
    public void error(String s) {
        logger.error(s);
    }

    public void debug(String s) {
        logger.debug(s);
    }

    public void warn(String s) {
        logger.warn(s);
    }
}
