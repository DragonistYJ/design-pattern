package love.mmjj.mediator;

import java.util.List;

/**
 * @author YuJian
 * @since 2020/11/14
 */
public class ChineseColleague extends AbstractColleague {
    public ChineseColleague(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message, List<AbstractColleague> receivers) {
        mediator.send(message, this, receivers);
    }

    @Override
    public void receive(String message) {
        System.out.println("Chinese colleague receive message: " + message);
    }
}
