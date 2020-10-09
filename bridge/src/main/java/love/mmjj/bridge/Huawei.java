package love.mmjj.bridge;

/**
 * @author YuJian
 * @description
 * @since 2020/10/9
 */
public class Huawei extends Phone {
    @Override
    public void run() {
        System.out.println("huawei phone");
        software.run();
    }
}
