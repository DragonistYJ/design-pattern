package love.mmjj.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author YuJian
 * @description 传令员，接收和下达命令的人
 * @since 2020/11/2
 */
public class Herald {
    private final List<Command> commands;

    public Herald() {
        this.commands = new ArrayList<>();
    }

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void cancelCommand(Command command) {
        commands.remove(command);
    }

    /**
     * 发送指令，真正执行命令
     */
    public void send() {
        commands.forEach(Command::execute);
    }
}
