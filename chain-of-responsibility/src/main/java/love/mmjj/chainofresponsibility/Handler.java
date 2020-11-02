package love.mmjj.chainofresponsibility;

/**
 * @author YuJian
 * @description
 * @since 2020/11/2
 */
public abstract class Handler {
    /**
     * 继任者，下一个处理者
     */
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    /**
     * 具体的处理逻辑
     *
     * @param request 具体的请求参数
     */
    public abstract void handleRequest(int request);
}
