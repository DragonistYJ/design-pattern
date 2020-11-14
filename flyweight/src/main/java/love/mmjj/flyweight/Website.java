package love.mmjj.flyweight;

/**
 * @author YuJian
 * @since 2020/11/14
 * 共享模板接口
 */
public interface Website {
    /**
     * 使用网站
     *
     * @param user 使用的用户
     */
    void use(User user);
}
