package Factory.Product;

import Factory.Product.interfaces.TextField;

/**
 * Created with IntelliJ IDEA
 *
 * @description:
 * @author: yaoweihao
 * @date: 2018/7/19
 * @time: 20:09
 * @modified by:
 */
public class SpringTextField implements TextField{
    public void display() {
        System.out.print("显示浅绿色的文本框 ");
    }
}
