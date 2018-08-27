package Decorator;

/**
 * @program: design-pattern
 * @description: 装饰角色
 * @author: showtime
 * @create: 2018-08-25 21:57
 **/
public abstract class Decorator implements Component {
    protected Component component;

    public Decorator(Component component){
        super();
        this.component = component;
    }

    public abstract void sampleOperation();

}
