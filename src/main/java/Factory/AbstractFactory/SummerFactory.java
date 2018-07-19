package Factory.AbstractFactory;

import Factory.AbstractFactory.interfaces.AbstractFactory;
import Factory.Product.SummerButton;
import Factory.Product.SummerTextField;
import Factory.Product.interfaces.Button;
import Factory.Product.interfaces.TextField;

/**
 * Created with IntelliJ IDEA
 *
 * @description: Summer皮肤工厂：具体工厂
 * @author: yaoweihao
 * @date: 2018/7/19
 * @time: 20:20
 * @modified by:
 */
public class SummerFactory implements AbstractFactory {
    public Button createButton() {
        return new SummerButton();
    }

    public TextField createTextField() {
        return new SummerTextField();
    }
}
