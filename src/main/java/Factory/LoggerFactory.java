package Factory;

import Factory.Product.interfaces.Logger;

/**
 * @program: design-pattern
 * @description: 抽象工厂类
 * @author: showtime
 * @create: 2018-07-15 14:37
 **/
public interface LoggerFactory {
    Logger createLogger();
}
