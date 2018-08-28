package Adapter;

import Adapter.Interface.Target;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA
 *
 * @description: 适配器
 * @author: yaoweihao
 * @date: 2018/8/28
 * @time: 15:10
 * @modified by:
 */
public class Adapter implements Target{
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
    //适配方法
    public void request(Map<String, String> boby) {
        List<String> list = new ArrayList<String>();
        for(Map.Entry<String, String> entry : boby.entrySet()) {
            list.add(entry.getKey() + "-" + entry.getValue());
        }
        adaptee.simpleRequest((String[]) list.toArray());
    }
}
