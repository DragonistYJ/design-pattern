package love.mmjj.command;

/**
 * @author YuJian
 * @description
 * @since 2020/11/2
 */
public class CookDinnerCommand extends Command {
    public CookDinnerCommand(Executor executor) {
        super(executor);
    }

    @Override
    public void execute() {
        executor.cookDinner();
    }
}
