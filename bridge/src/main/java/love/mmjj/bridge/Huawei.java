package love.mmjj.bridge;

/**
 * @author YuJian
 * @since 2020/10/9
 */
public class Huawei extends AbstractPhone {
    @Override
    public void run() {
        System.out.println("huawei phone");
        software.run();
    }
}
