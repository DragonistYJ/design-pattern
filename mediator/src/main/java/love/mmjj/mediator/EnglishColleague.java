package love.mmjj.mediator;

import java.util.List;

/**
 * @author YuJian
 * @since 2020/11/14
 */
public class EnglishColleague extends AbstractColleague {
    public EnglishColleague(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message, List<AbstractColleague> receivers) {
        mediator.send(message, this, receivers);
    }

    @Override
    public void receive(String message) {
        System.out.println("English colleague receive message: " + message);
    }
}
