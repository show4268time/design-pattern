package Factory.AbstractFactory;

import Factory.AbstractFactory.interfaces.AbstractFactory;
import Factory.Product.SpringButton;
import Factory.Product.SpringTextField;
import Factory.Product.interfaces.Button;
import Factory.Product.interfaces.TextField;

/**
 * Created with IntelliJ IDEA
 *
 * @description: Spring皮肤工厂：具体工厂
 * @author: yaoweihao
 * @date: 2018/7/19
 * @time: 20:18
 * @modified by:
 */
public class SpringFactory implements AbstractFactory {
    public Button createButton() {
        return new SpringButton();
    }

    public TextField createTextField() {
        return new SpringTextField();
    }
}
