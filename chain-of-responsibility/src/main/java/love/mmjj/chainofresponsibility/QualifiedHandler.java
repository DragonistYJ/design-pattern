package love.mmjj.chainofresponsibility;

/**
 * @author YuJian
 * @description
 * @since 2020/11/2
 */
public class QualifiedHandler extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 60 && request < 80) {
            System.out.println("考试合格");
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
