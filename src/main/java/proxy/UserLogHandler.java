package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @program: design-pattern
 * @description: 用户Dao代理类
 * @author: showtime
 * @create: 2018-07-29 22:10
 **/
public class UserLogHandler implements InvocationHandler {
    private Object object;

    public UserLogHandler(Object object){
        this.object = object;
    }


    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeInvoke();
        Object result = method.invoke(object, args);
        afterInvoke();
        return result;
    }

    //记录方法调用时间
    public void beforeInvoke(){
        GregorianCalendar calendar = new GregorianCalendar();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        String time = hour + ":" + minute + ":" + second;
        System.out.println("调用时间：" + time);
    }

    public void afterInvoke(){
        System.out.println("方法调用结束！" );
    }

}
