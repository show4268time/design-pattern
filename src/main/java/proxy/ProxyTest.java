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
        UserDaoService userDaoService = new  UserDaoImpl();
        InvocationHandler handler = new UserLogHandler(userDaoService);

        UserDaoService proxy = (UserDaoService) Proxy.newProxyInstance(userDaoService.getClass().getClassLoader(), new Class[]{UserDaoService.class}, handler);

        proxy.findByUserName("showtime");

        proxy.deleteByUserName("showtime");
    }
}
