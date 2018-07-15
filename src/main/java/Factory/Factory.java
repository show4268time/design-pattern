package Factory;

import Factory.Product.Shape;

/**
 * @program: design-pattern
 * @description: 抽象工厂类
 * @author: showtime
 * @create: 2018-07-15 14:37
 **/
public interface Factory {
    Shape getShape();
}
