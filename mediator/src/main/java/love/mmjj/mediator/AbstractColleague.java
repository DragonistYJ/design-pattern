package love.mmjj.mediator;

import java.util.List;

/**
 * @author YuJian
 * @since 2020/11/14
 */
public abstract class AbstractColleague {
    protected Mediator mediator;

    public AbstractColleague(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * 向每个接收者发送消息
     *
     * @param message   消息内容
     * @param receivers 接受者list
     */
    public abstract void send(String message, List<AbstractColleague> receivers);

    /**
     * 接收消息
     *
     * @param message 消息内容
     */
    public abstract void receive(String message);
}
