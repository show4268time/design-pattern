package Singleton;

/**
 * Created with IntelliJ IDEA
 *
 * @description: 双检锁/双重校验锁
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 * 这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
 * getInstance() 的性能对应用程序很关键。
 * @author: yaoweihao
 * @date: 2018/6/12
 * @time: 20:29
 * @modified by:
 */
public class DoubleCheckSingleton  {
    private static volatile DoubleCheckSingleton instance = null;

    private DoubleCheckSingleton (){}

    public static  DoubleCheckSingleton getInstance() {
        if(instance == null){
            synchronized (DoubleCheckSingleton.class){
                if(instance == null){
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
