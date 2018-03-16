package ChainOfResponsibility;

/**
 * Created with IntelliJ IDEA
 *
 * @description:
 * @author: yaoweihao
 * @date: 2018/3/16
 * @time: 17:56
 * @modified by:
 */
public class Manager extends AbstractClerk {
    Manager() {
        super.type = "经理";
    }

    @Override
    public int getLimit() {
        return 100000;
    }
}
