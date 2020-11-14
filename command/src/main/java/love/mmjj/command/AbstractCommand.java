package love.mmjj.command;

/**
 * @author YuJian
 * @since 2020/11/2
 * 一条命令，由其中的命令执行者来执行
 */
public abstract class AbstractCommand {
    protected Executor executor;

    public AbstractCommand(Executor executor) {
        this.executor = executor;
    }

    /**
     * 真正执行命令的抽象逻辑
     */
    public abstract void execute();
}
