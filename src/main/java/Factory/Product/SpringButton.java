package Factory.Product;

import Factory.Product.interfaces.Button;

/**
 * Created with IntelliJ IDEA
 *
 * @description: Spring按钮类：具体产品
 * @author: yaoweihao
 * @date: 2018/7/19
 * @time: 20:00
 * @modified by:
 */
public class SpringButton implements Button {
    public void display() {
        System.out.print("显示浅绿色按钮 ");
    }
}
