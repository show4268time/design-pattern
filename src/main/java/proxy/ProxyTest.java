package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @program: design-pattern
 * @description: 代理类测试
 * @author: showtime
 * @create: 2018-07-29 22:23
 **/
public class ProxyTest {
    public static void main(String[] args){
        //实例化被代理类
        UserDaoService userDaoService = new  UserDaoImpl();
        //实例化代理类
        InvocationHandler handler = new UserLogHandler(userDaoService);
        //生成动态代理类
        UserDaoService proxy = (UserDaoService) Proxy.newProxyInstance(UserDaoService.class.getClassLoader(), new Class[]{UserDaoService.class}, handler);

        proxy.findByUserName("showtime");

        proxy.deleteByUserName("showtime");
    }
}
