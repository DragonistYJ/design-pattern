package love.mmjj.flyweight;

/**
 * @author YuJian
 * @since 2020/11/14
 */
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
