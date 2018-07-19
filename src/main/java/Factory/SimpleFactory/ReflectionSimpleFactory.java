package Factory.SimpleFactory;

import Factory.Product.interfaces.Shape;

/**
 * 这种方式的虽然符合了 开放-关闭原则 ，但是每一次传入的都是产品类的全部路径，这样比较麻烦。
 * 如果需要改善的话可以通过 反射+配置文件 的形式来改善，这种方式使用的也是比较多的。
 */
public class ReflectionSimpleFactory {
    public static Shape getShape(Class<? extends Shape> clazz) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        if(clazz == null){
            return null;
        }
        Shape shape = (Shape) Class.forName(clazz.getName()).newInstance();
        return shape;

    }
}
