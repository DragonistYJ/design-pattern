package love.mmjj.mediator;

import java.util.List;

/**
 * @author YuJian
 * @since 2020/11/14
 */
public class AmericanColleague extends AbstractColleague {
    public AmericanColleague(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message, List<AbstractColleague> receivers) {
        mediator.send(message, this, receivers);
    }

    @Override
    public void receive(String message) {
        System.out.println("American colleague receive message: " + message);
    }
}
