package Adapter;

import Adapter.Interface.Target;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA
 *
 * @description: 适配器类
 * @author: yaoweihao
 * @date: 2018/8/28
 * @time: 15:10
 * @modified by:
 */
public class Adapter implements Target{
    /*
    * 持有需要被适配的接口对象
    */
    private Adaptee adaptee;
    /*
     * 构造方法，传入需要被适配的对象
     * @param adaptee 需要被适配的对象
     */
    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }
    public void request() {
        //业务处理
        adaptee.specificRequest();
    }
}
