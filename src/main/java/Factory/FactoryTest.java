package Factory;

import Factory.Product.Shape;

/**
 * @program: design-pattern
 * @description: 工厂模式测试类
 * @author: showtime
 * @create: 2018-07-15 14:48
 **/
public class FactoryTest {
    public static void main(String[] args){
        Factory factory = new CricleFactory();
        Shape shape = factory.getShape();
        shape.draw();
    }
}
