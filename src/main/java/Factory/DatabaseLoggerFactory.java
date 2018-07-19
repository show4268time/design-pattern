package Factory;


import Factory.Product.DatabaseLogger;
import Factory.Product.interfaces.Logger;

/**
 * @program: design-pattern
 * @description: 数据库日志记录器工厂类：具体工厂
 * @author: showtime
 * @create: 2018-07-15 14:43
 **/
public class DatabaseLoggerFactory implements LoggerFactory {
    public Logger createLogger() {
        return new DatabaseLogger();
    }
}
