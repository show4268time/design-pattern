package Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created with IntelliJ IDEA
 *
 * @description: 单例测试
 * @author: yaoweihao
 * @date: 2018/6/25
 * @time: 20:46
 * @modified by:
 */
public class SingletonTest {
    public static void main(String[] str) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //获得构造器
        Constructor<Singleton2> con = Singleton2.class.getDeclaredConstructor();
        //设置为可访问
        con.setAccessible(true);
        //构造两个不同的对象
        Singleton2 singleton1 =  con.newInstance();
        Singleton2 singleton2 =  con.newInstance();
        //验证是否是不同对象
        System.out.println(singleton1.equals(singleton2));
    }
}
