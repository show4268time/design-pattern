package Observer;

/**
 * Created with IntelliJ IDEA
 *
 * @description:
 * @author: yaoweihao
 * @date: 2018/8/29
 * @time: 15:10
 * @modified by:
 */
public class ConcreteObserver implements Observer {

    private String observerStatus;
    @Override
    public void update(String status) {
        this.observerStatus = status;
        System.out.print("状态为:" + status);
    }
}
