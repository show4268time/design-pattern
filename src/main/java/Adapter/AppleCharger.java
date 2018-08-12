package Adapter;

/**
 * @program: design-pattern
 * @description: 苹果设备充电器
 * @author: showtime
 * @create: 2018-08-12 23:14
 **/
public class AppleCharger implements LightningInterface {
    public void chargeWithLightning() {
        System.out.println("使用Lightning型号的充电器充电...");
    }
}
