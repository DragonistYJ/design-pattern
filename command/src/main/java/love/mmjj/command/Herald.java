package love.mmjj.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author YuJian
 * @since 2020/11/2
 * 传令员，接收和下达命令的人
 */
public class Herald {
    private final List<AbstractCommand> commands;

    public Herald() {
        this.commands = new ArrayList<>();
    }

    public void addCommand(AbstractCommand command) {
        commands.add(command);
    }

    public void cancelCommand(AbstractCommand command) {
        commands.remove(command);
    }

    /**
     * 发送指令，真正执行命令
     */
    public void send() {
        commands.forEach(AbstractCommand::execute);
    }
}
