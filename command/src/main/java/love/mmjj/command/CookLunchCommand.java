package love.mmjj.command;

/**
 * @author YuJian
 * @description
 * @since 2020/11/2
 */
public class CookLunchCommand extends Command {
    public CookLunchCommand(Executor executor) {
        super(executor);
    }

    @Override
    public void execute() {
        executor.cookLunch();
    }
}
