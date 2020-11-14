package love.mmjj.chainofresponsibility;

/**
 * @author YuJian
 * @since 2020/11/2
 * 职责链模式：多个对象都有机会处理请求，从而避免请求的发送者和接收者之间的耦合关系。
 * 将这个对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理它为止
 */
public class ChainOfResponsibilityMain {
    public static void main(String[] args) {
        AbstractHandler failHandler = new FailHandler();
        AbstractHandler qualifiedHandler = new QualifiedHandler();
        failHandler.setSuccessor(qualifiedHandler);
        AbstractHandler excellentHandler = new ExcellentHandler();
        qualifiedHandler.setSuccessor(excellentHandler);

        int[] grades = new int[]{40, 70, 81, 100};
        for (int grade : grades) {
            failHandler.handleRequest(grade);
        }
    }
}
