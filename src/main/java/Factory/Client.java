package Factory;

/**
 * @program: design-pattern
 * @description: 客户端测试代码
 * @author: showtime
 * @create: 2018-07-15 22:14
 **/
public class Client {
    public static void main(String[] args){
        LoggerFactory factory = new FileLoggerFactory();
        factory.createLogger().writeLog();

        factory = new DatabaseLoggerFactory();
        factory.createLogger().writeLog();
    }
}
