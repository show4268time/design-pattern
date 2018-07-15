package Factory;

import Factory.Product.FileLogger;
import Factory.Product.Logger;
/**
 * @program: design-pattern
 * @description: 文件日志记录器工厂类：具体工厂
 * @author: showtime
 * @create: 2018-07-15 14:45
 **/
public class FileLoggerFactory implements LoggerFactory {
    public Logger createLogger() {
        return new FileLogger();
    }
}
