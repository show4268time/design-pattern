package Decorator;

/**
 * Created with IntelliJ IDEA
 *
 * @description:
 * @author: yaoweihao
 * @date: 2018/8/27
 * @time: 14:18
 * @modified by:
 */
public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component){
        super(component);
    }
    public void sampleOperation() {
        System.out.println("针对该方法加一层包装");
        component.sampleOperation();
        System.out.println("包装结束");
    }
}
