package love.mmjj.chainofresponsibility;

/**
 * @author YuJian
 * @description
 * @since 2020/11/2
 */
public class ExcellentHandler extends Handler {
    @Override
    public void handleRequest(int request) {
        if (request >= 80 && request <= 100) {
            System.out.println("考试优秀");
        }
    }
}
