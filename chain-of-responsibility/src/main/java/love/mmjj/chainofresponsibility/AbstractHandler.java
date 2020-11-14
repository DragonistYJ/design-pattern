package love.mmjj.chainofresponsibility;

/**
 * @author YuJian
 * @since 2020/11/2
 */
public abstract class AbstractHandler {
    /**
     * 继任者，下一个处理者
     */
    protected AbstractHandler successor;

    public void setSuccessor(AbstractHandler successor) {
        this.successor = successor;
    }

    /**
     * 具体的处理逻辑
     *
     * @param request 具体的请求参数
     */
    public abstract void handleRequest(int request);
}
