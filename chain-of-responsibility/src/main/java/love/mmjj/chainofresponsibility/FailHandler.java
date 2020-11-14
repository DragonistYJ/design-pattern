package love.mmjj.chainofresponsibility;

/**
 * @author YuJian
 * @since 2020/11/2
 */
public class FailHandler extends AbstractHandler {
    @Override
    public void handleRequest(int request) {
        if (request < 60) {
            System.out.println("考试不及格");
        } else if (successor != null) {
            successor.handleRequest(request);
        }
    }
}
