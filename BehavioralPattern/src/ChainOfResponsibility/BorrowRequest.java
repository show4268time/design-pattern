package ChainOfResponsibility;

/**
 * Created with IntelliJ IDEA
 *
 * @description:
 * @author: yaoweihao
 * @date: 2018/3/16
 * @time: 17:26
 * @modified by:
 */
public class BorrowRequest {
    private int requestMoney;
    BorrowRequest(int money) {
        System.out.println("有新请求，需要借款 " + money + " 元");
        requestMoney = money;
    }
    public int getMoney() {
        return requestMoney;
    }
}
