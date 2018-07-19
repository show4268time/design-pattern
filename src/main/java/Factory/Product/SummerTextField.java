package Factory.Product;

import Factory.Product.interfaces.TextField;

/**
 * Created with IntelliJ IDEA
 *
 * @description:
 * @author: yaoweihao
 * @date: 2018/7/19
 * @time: 20:12
 * @modified by:
 */
public class SummerTextField implements TextField {
    public void display() {
        System.out.print("浅蓝色的文本框 ");
    }
}
