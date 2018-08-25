package Decorator;

/**
 * @program: design-pattern
 * @description: 装饰角色
 * @author: showtime
 * @create: 2018-08-25 21:57
 **/
public class Decorator implements Component {
    private Component component;

    public Decorator(Component component){
        this.component = component;
    }

    public void sampleOperation() {
        component.sampleOperation();
    }
}
