package Factory.Product;

import Factory.Product.interfaces.Logger;

/**
 * @program: design-pattern
 * @description: 文件日志记录器：具体产品
 * @author: showtime
 * @create: 2018-07-15 22:11
 **/
public class FileLogger implements Logger {
    public void writeLog() {
        System.out.println("文件日志记录。");
    }
}
