package Adapter;

/**
 * @program: design-pattern
 * @description: 安卓设备充电器
 * @author: showtime
 * @create: 2018-08-12 23:13
 **/
public class AndroidCharger implements MicroUsbInterface{
    public void chargeWithMicroUsb() {
        System.out.println("使用MicroUsb型号的充电器充电...");
    }
}
