package love.mmjj.command;

/**
 * @author YuJian
 * @since 2020/11/2
 */
public class CookLunchCommand extends AbstractCommand {
    public CookLunchCommand(Executor executor) {
        super(executor);
    }

    @Override
    public void execute() {
        executor.cookLunch();
    }
}
