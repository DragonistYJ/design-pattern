package love.mmjj.flyweight;

/**
 * @author YuJian
 * @since 2020/11/14
 */
public class ConcreteWebsite implements Website {
    private final String name;

    public ConcreteWebsite(String name) {
        this.name = name;
    }

    @Override
    public void use(User user) {
        System.out.println("网站类型：" + name + " 使用者：" + user.getName());
    }
}
