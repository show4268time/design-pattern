package Factory;

import Factory.Product.Rectangle;
import Factory.Product.Shape;

/**
 * @program: design-pattern
 * @description: 长方形工厂类
 * @author: showtime
 * @create: 2018-07-15 14:45
 **/
public class RectangleFactory implements Factory{
    public Shape getShape() {
        return new Rectangle();
    }
}
