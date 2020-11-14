package love.mmjj.mediator;

import java.util.List;

/**
 * @author YuJian
 * @since 2020/11/14
 */
public interface Mediator {
    /**
     * 发送消息
     *
     * @param message  消息内容
     * @param sender   发送者
     * @param receivers 接收者list
     */
    void send(String message, AbstractColleague sender, List<AbstractColleague> receivers);
}
