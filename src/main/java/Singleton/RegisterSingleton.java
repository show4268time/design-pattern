package Singleton;

import org.apache.commons.lang3.StringUtils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created with IntelliJ IDEA
 *
 * @description: 登记模式
 * 登记式单例是为了克服饿汉式和懒汉式单例类均不可被继承的缺点而设计的。
 * @author: yaoweihao
 * @date: 2018/7/8
 * @time: 15:40
 * @modified by:
 */
public class RegisterSingleton {

    //构建采用ConcurrentHashMap,用于充当缓存注册表
    private final static Map<String, Object> singletonObjects = new ConcurrentHashMap<String, Object>();

    //通过static静态代码块来进行初始化RegisterSingleton当前类的实例，并将当前实例存入registerSingletonInstance
    static {
        RegisterSingleton registerSingleton = new RegisterSingleton();
        singletonObjects.put(registerSingleton.getClass().getName(), registerSingleton);
    }

    //注意区别，此处提供的是非private类型的，说明当前类可以被继承
    protected RegisterSingleton() {
    }

    public static RegisterSingleton getRegisterSingleton(String className) {
        if(StringUtils.isBlank(className)){
            return null;
        }else {
            if(singletonObjects.get(className) == null){
                try {
                    singletonObjects.put(className, Class.forName(className).newInstance());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return (RegisterSingleton) singletonObjects.get(className);
        }
    }
}
