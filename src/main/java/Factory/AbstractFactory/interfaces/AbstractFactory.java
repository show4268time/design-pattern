package Factory.AbstractFactory.interfaces;

import Factory.Product.interfaces.Button;
import Factory.Product.interfaces.TextField;

/**
 * Created with IntelliJ IDEA
 *
 * @description: 界面皮肤工厂接口：抽象工厂
 * @author: yaoweihao
 * @date: 2018/7/19
 * @time: 20:14
 * @modified by:
 */
public interface AbstractFactory {
    Button createButton();

    TextField createTextField();
}
