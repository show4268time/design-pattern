package Factory;

import Factory.Product.Circle;
import Factory.Product.Shape;

/**
 * @program: design-pattern
 * @description: 圆形工厂类
 * @author: showtime
 * @create: 2018-07-15 14:43
 **/
public class CricleFactory implements Factory {
    public Shape getShape() {
        return new Circle();
    }
}
