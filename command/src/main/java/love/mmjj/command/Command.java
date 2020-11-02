package love.mmjj.command;

/**
 * @author YuJian
 * @description 一条命令，由其中的命令执行者来执行
 * @since 2020/11/2
 */
public abstract class Command {
    protected Executor executor;

    public Command(Executor executor) {
        this.executor = executor;
    }

    /**
     * 真正执行命令的抽象逻辑
     */
    public abstract void execute();
}
