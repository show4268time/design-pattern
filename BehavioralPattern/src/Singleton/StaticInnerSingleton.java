package Singleton;

/**
 * Created with IntelliJ IDEA
 * 这种方式同样利用了 classloder 机制来保证初始化 instance 时只有一个线程，
 * 这种方式是 Singleton 类被装载了，instance 不一定被初始化。因为 SingletonHolder 类没有被主动使用，只有通过显式调用 getInstance 方法时，
 * 才会显式装载 SingletonHolder 类，从而实例化 instance。
 * @description: 静态内部类方法
 * @author: yaoweihao
 * @date: 2018/6/14
 * @time: 20:40
 * @modified by:
 */
public class StaticInnerSingleton {
    private StaticInnerSingleton(){}

    private static class SingletonHolder{
        private static StaticInnerSingleton instance = new StaticInnerSingleton();
    }

    public static StaticInnerSingleton getInstance() {
        return SingletonHolder.instance;
    }
}
