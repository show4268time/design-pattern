package Factory;

import Factory.Product.Shape;
import Factory.Product.Square;

/**
 * @program: design-pattern
 * @description: 正方形工厂类
 * @author: showtime
 * @create: 2018-07-15 14:47
 **/
public class SquareFactory implements Factory{
    public Shape getShape() {
        return new Square();
    }
}
