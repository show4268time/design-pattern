package Observer;

/**
 * Created with IntelliJ IDEA
 *
 * @description: 抽象主题(Subject)角色
 * @author: yaoweihao
 * @date: 2018/8/29
 * @time: 14:53
 * @modified by:
 */
public interface Subject {
    void register(Observer observer);

    void unregister(Observer observer);

    void notifyObservers(String status);
}
