package love.mmjj.flyweight;

/**
 * @author YuJian
 * @since 2020/11/14
 * 享元模式，运用共享技术有效地支持大量细粒度的对象
 */
public class FlyweightMain {
    public static void main(String[] args) {
        WebsiteFactory websiteFactory = new WebsiteFactory();

        Website website1 = websiteFactory.getWebsite("产品展示");
        website1.use(new User("user1"));

        Website website2 = websiteFactory.getWebsite("博客");
        website2.use(new User("user2"));

        Website website = websiteFactory.getWebsite("产品展示");
        website.use(new User("user3"));

        System.out.println(websiteFactory.count());
    }
}
