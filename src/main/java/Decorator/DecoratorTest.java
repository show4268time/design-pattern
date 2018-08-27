package Decorator;

/**
 * Created with IntelliJ IDEA
 *
 * @description:
 * @author: yaoweihao
 * @date: 2018/8/27
 * @time: 16:52
 * @modified by:
 */
public class DecoratorTest {
    public static void main(String[] args){
        //装饰模式对客户端的透明性要求程序不要声明一个ConcreteComponent类型的变量，而应当声明一个Component类型的变量。
        Component component = new ConcreteComponent();
        //全透明
        Component concreteDecorator = new ConcreteDecorator(component);
        //半透明， 这样的装饰模式也称做半装饰、半适配器模式。
        ConcreteDecorator concreteDecorator1 = new ConcreteDecorator(component);
        concreteDecorator.sampleOperation();
        concreteDecorator1.sampleOperation();
    }
}
