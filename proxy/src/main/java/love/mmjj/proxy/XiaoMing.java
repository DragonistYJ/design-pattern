package love.mmjj.proxy;

/**
 * @author YuJian
 * @date 2020/8/26
 * @description
 */
public class XiaoMing implements Pursuit {
    private final Girl girl;

    public XiaoMing(Girl girl) {
        this.girl = girl;
    }

    @Override
    public void showLove() {
        System.out.println("I love you, " + girl.getName());
    }
}
