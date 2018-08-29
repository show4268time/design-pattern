package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 *
 * @description:
 * @author: yaoweihao
 * @date: 2018/8/29
 * @time: 15:01
 * @modified by:
 */
public class ConcreteSubject implements Subject {

    private List<Observer> observerList = new ArrayList<Observer>();

    public void register(Observer observer) {
        observerList.add(observer);
    }

    public void unregister(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObservers(String status) {
        observerList.stream().forEach(observer -> observer.update(status));
    }
}
