package love.mmjj.proxy;

/**
 * @author YuJian
 * @date 2020/8/26
 * @description
 */
public class ProxyMain {
    public static void main(String[] args) {
        new Proxy(new Girl("Xiao Hong")).showLove();
    }
}
