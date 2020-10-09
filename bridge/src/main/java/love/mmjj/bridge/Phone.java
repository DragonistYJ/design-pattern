package love.mmjj.bridge;

/**
 * @author YuJian
 * @description
 * @since 2020/10/9
 */
public abstract class Phone {
    protected Software software;

    public void setSoftware(Software software) {
        this.software = software;
    }

    public abstract void run();
}
