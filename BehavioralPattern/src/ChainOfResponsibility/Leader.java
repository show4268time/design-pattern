package ChainOfResponsibility;

/**
 * Created with IntelliJ IDEA
 *
 * @description:
 * @author: yaoweihao
 * @date: 2018/3/16
 * @time: 17:45
 * @modified by:
 */
public class Leader extends AbstractClerk {
    Leader() {
        super.type = "组长";
    }
    @Override
    public int getLimit() {
        return 20000;
    }
}
