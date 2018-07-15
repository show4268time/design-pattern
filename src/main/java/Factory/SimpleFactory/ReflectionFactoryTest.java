package Factory.SimpleFactory;

import Factory.Product.Circle;
import Factory.Product.Shape;

public class ReflectionFactoryTest {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Shape circle = ReflectionSimpleFactory.getShape(Circle.class);
        circle.draw();
    }
}
