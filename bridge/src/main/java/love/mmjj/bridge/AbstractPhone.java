package love.mmjj.bridge;

/**
 * @author YuJian
 * @since 2020/10/9
 */
public abstract class AbstractPhone {
    protected Software software;

    public void setSoftware(Software software) {
        this.software = software;
    }

    /**
     * 运行的抽象方法
     */
    public abstract void run();
}
