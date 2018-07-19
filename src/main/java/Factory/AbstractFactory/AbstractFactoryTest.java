package Factory.AbstractFactory;

import Factory.AbstractFactory.interfaces.AbstractFactory;
import Factory.Product.interfaces.Button;
import Factory.Product.interfaces.TextField;

/**
 * Created with IntelliJ IDEA
 *
 * @description:
 * @author: yaoweihao
 * @date: 2018/7/19
 * @time: 20:21
 * @modified by:
 */
public class AbstractFactoryTest {
    public static void main(String args[]){
        AbstractFactory abstractFactory;
        Button button;
        TextField textField;
        //spring工厂
        abstractFactory = new SpringFactory();
        button = abstractFactory.createButton();
        textField = abstractFactory.createTextField();

        button.display();
        textField.display();

        //summer工厂
        abstractFactory = new SummerFactory();
        button = abstractFactory.createButton();
        textField = abstractFactory.createTextField();

        button.display();
        textField.display();

    }

}
