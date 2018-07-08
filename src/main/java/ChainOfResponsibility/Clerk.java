package ChainOfResponsibility;

/**
 * Created with IntelliJ IDEA
 *
 * @description:
 * @author: yaoweihao
 * @date: 2018/3/16
 * @time: 17:39
 * @modified by:
 */
public class Clerk extends AbstractClerk {
    Clerk() {
        super.type = "职员";
    }
    @Override
    public int getLimit() {
        return 5000;
    }
}
