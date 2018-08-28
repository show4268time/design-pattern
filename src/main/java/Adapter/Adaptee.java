package Adapter;

/**
 * Created with IntelliJ IDEA
 *
 * @description: 被适配类
 * @author: yaoweihao
 * @date: 2018/8/28
 * @time: 15:09
 * @modified by:
 */
public class Adaptee {
    public void simpleRequest(String[] boby){
        System.out.print(boby);
    }
}
