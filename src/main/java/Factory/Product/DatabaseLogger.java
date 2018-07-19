package Factory.Product;

import Factory.Product.interfaces.Logger;

/**
 * @program: design-pattern
 * @description: 数据库日志记录器：具体产品
 * @author: showtime
 * @create: 2018-07-15 22:10
 **/
public class DatabaseLogger implements Logger {
    public void writeLog() {
        System.out.println("数据库日志记录。");
    }
}
