package love.mmjj.proxy;

/**
 * @author YuJian
 * @date 2020/8/26
 * @description
 */
public class Proxy implements Pursuit {
    private final Pursuit pursuit;

    public Proxy(Girl girl) {
        this.pursuit = new XiaoMing(girl);
    }

    @Override
    public void showLove() {
        if (this.pursuit != null) {
            pursuit.showLove();
        }
    }
}
