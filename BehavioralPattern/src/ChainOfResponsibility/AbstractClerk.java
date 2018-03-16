package ChainOfResponsibility;

/**
 * Created with IntelliJ IDEA
 *
 * @description:
 * @author: yaoweihao
 * @date: 2018/3/16
 * @time: 17:28
 * @modified by:
 */
public abstract class  AbstractClerk {
    private AbstractClerk superior = null;
    protected String type;
    public void setSuperior(AbstractClerk superior) {
        this.superior = superior;
    }
    public void approveRequest(BorrowRequest request) {
        if(getLimit() >= request.getMoney()) {
            System.out.println(getType() + "同意借款请求");
        }else {
            if(this.superior != null) {
                this.superior.approveRequest(request);
            }else {
                System.out.println("没有人能够同意借款请求");
            }
        }
    }
    public abstract int getLimit();
    public String getType() {
        return type;
    }
}
