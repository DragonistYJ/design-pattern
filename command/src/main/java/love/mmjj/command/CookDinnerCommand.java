package love.mmjj.command;

/**
 * @author YuJian
 * @since 2020/11/2
 */
public class CookDinnerCommand extends AbstractCommand {
    public CookDinnerCommand(Executor executor) {
        super(executor);
    }

    @Override
    public void execute() {
        executor.cookDinner();
    }
}
