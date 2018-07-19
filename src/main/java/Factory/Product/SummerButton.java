package Factory.Product;

import Factory.Product.interfaces.Button;

/**
 * Created with IntelliJ IDEA
 *
 * @description: Summer按钮类：具体产品
 * @author: yaoweihao
 * @date: 2018/7/19
 * @time: 20:02
 * @modified by:
 */
public class SummerButton implements Button{
    public void display() {
        System.out.print("显示浅蓝色的按钮 ");
    }
}
