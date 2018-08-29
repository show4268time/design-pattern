package Observer;

/**
 * Created with IntelliJ IDEA
 *
 * @description:
 * @author: yaoweihao
 * @date: 2018/8/29
 * @time: 15:38
 * @modified by:
 */
public class ObserverTest {
    public static void main(String[] args){
        Observer observer = new ConcreteObserver();

        Subject subject = new ConcreteSubject();
        subject.register(observer);

        subject.notifyObservers("new Status");
    }
}
