package love.mmjj.mediator;

import java.util.List;

/**
 * @author YuJian
 * @since 2020/11/14
 */
public class ConcreteMediator implements Mediator {
    @Override
    public void send(String message, AbstractColleague sender, List<AbstractColleague> receivers) {
        System.out.println(sender + " send message: " + message);
        receivers.forEach(receiver -> receiver.receive(message));
    }
}
