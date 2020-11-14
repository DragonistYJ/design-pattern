package love.mmjj.flyweight;

import java.util.HashMap;

/**
 * @author YuJian
 * @since 2020/11/14
 */
public class WebsiteFactory {
    private final HashMap<String, Website> websiteMap = new HashMap<>();

    public Website getWebsite(String name) {
        if (!websiteMap.containsKey(name)) {
            websiteMap.put(name, new ConcreteWebsite(name));
        }
        return websiteMap.get(name);
    }

    public int count() {
        return websiteMap.size();
    }
}
